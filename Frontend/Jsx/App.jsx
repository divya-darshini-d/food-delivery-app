import React, { useState, useRef } from 'react';
import Navbar from './components/Navbar/Navbar';
import { Route, Routes, useLocation } from 'react-router-dom';
import Home from './pages/Home/Home';
import Cart from './pages/Cart/Cart';
import PlaceOrder from './pages/PlaceOrder/PlaceOrder';
import LoginPage from './components/LoginPopup/LoginPopup';
import Restaurant from './pages/Restaurant/Restaurant';
import Payment from './pages/Payment/Payment';
import Footer from './components/Footer/Footer';

const App = () => {
  const [showLogin, setShowLogin] = useState(false);
  const location = useLocation(); // Get the current route
  const footerRef = useRef(null);

  // Define routes where the footer should be hidden
  const hideFooterRoutes = ['/restaurant', '/payment'];

  const handleContactUsClick = () => {
    if (footerRef.current) {
      footerRef.current.scrollIntoView({ behavior: 'smooth' });
    }
  };

  return (
    <>
      {showLogin && <LoginPage setShowLogin={setShowLogin} />}
      <div className="app">
        <Navbar setShowLogin={setShowLogin} onContactUsClick={handleContactUsClick} />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/cart" element={<Cart />} />
          <Route path="/order" element={<PlaceOrder />} />
          <Route path="/restaurant" element={<Restaurant />} />
          <Route path="/payment" element={<Payment />} />
        </Routes>
        {/* Show Footer only if the current route is not in hideFooterRoutes */}
        {!hideFooterRoutes.includes(location.pathname) && <Footer ref={footerRef} />}
      </div>
    </>
  );
};

export default App;
