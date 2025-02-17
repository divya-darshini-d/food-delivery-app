import React, { useEffect, useState } from 'react';
import './Restaurant.css';
import { Link, useNavigate } from 'react-router-dom';

const Restaurant = () => {
    const [restaurants, setRestaurants] = useState([]);

    const navigate = useNavigate();

    // Fetch restaurant data from backend on component mount
    useEffect(() => {
        fetch("http://localhost:8080/restaurant") // Update with your backend URL
            .then(response => response.json())
            .then(data => {
                console.log(data); // Log data to check its structure
                setRestaurants(data);
            })
            .catch(error => console.error("Error fetching restaurants:", error));
    }, []);

    return (
        <div className="restaurant-container">
            <div className="restaurant-list">
                {restaurants.map((restaurant) => (
                    <div key={restaurant.id} className="restaurant-card">
                        {/* Ensure the restaurant name is rendered correctly */}
                        <h2>{restaurant.name}</h2>
                        <p><strong>Phone:</strong> {restaurant.ph_no}</p>
                        <p><strong>Address:</strong> {restaurant.address}</p>
                        <p><strong>Open Time:</strong> {restaurant.open_time}</p>
                        <Link to={`/restaurant/${restaurant.id}`} className="view-details">View Details</Link>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default Restaurant;
