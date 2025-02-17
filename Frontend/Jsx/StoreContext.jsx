import { createContext, useEffect, useState } from "react";
import { food_list } from "../assets/assets";
import axios from "axios";

export const StoreContext = createContext(null);

const StoreContextProvider = (props) => {
    const [cartItems, setCartItems] = useState({});

    // Fetch cart items from backend when component mounts
    useEffect(() => {
        axios.get("http://localhost:8080/cart")
            .then((response) => {
                const cartData = response.data.reduce((acc, item) => {
                    acc[item.item_Id] = item.quantity;
                    return acc;
                }, {});
                setCartItems(cartData);
            })
            .catch(error => console.error("Error fetching cart items:", error));
    }, []);

    // Add item to cart and update backend
    const addToCart = (itemId) => {
        const updatedCart = { ...cartItems, [itemId]: (cartItems[itemId] || 0) + 1 };
        setCartItems(updatedCart);

        const item = food_list.find(food => food._id === itemId);
        if (item) {
            axios.post("http://localhost:8080/cart", {
                item_Id: itemId,
                title: item.name,
                price: item.price,
                quantity: updatedCart[itemId],
                total: updatedCart[itemId] * item.price
            }).catch(error => console.error("Error adding item:", error));
        }
    };

    // Remove item from cart and update backend
    const removeFromCart = (itemId) => {
        if (!cartItems[itemId]) return;
        
        const updatedCart = { ...cartItems, [itemId]: cartItems[itemId] - 1 };
        if (updatedCart[itemId] === 0) delete updatedCart[itemId];
        setCartItems(updatedCart);

        axios.delete(`http://localhost:8080/cart/${itemId}`)
            .catch(error => console.error("Error removing item:", error));
    };

    // Calculate total amount
    const getTotalCartAmount = () => {
        return Object.keys(cartItems).reduce((total, itemId) => {
            let item = food_list.find(food => food._id == itemId);
            return item ? total + item.price * cartItems[itemId] : total;
        }, 0);
    };

    const contextValue = {
        food_list,
        cartItems,
        setCartItems,
        addToCart,
        removeFromCart,
        getTotalCartAmount
    };

    return (
        <StoreContext.Provider value={contextValue}>
            {props.children}
        </StoreContext.Provider>
    );
};

export default StoreContextProvider;
