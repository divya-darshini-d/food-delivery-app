"use client";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Payment.css";

const Payment = () => {
  const navigate = useNavigate();

  console.log("Payment Component Loaded!");

  // State to store payment details
  const [paymentDetails, setPaymentDetails] = useState({
    paymentMethod: "Credit Card",
    cardNumber: "",
    expiryDate: "",
    cvv: "",
    customer_id: 1, // Example customer ID, replace with actual user data
    status: "Pending"
  });

  const [error, setError] = useState("");

  // Handle input changes
  const handleChange = (e) => {
    setPaymentDetails({ ...paymentDetails, [e.target.name]: e.target.value });
  };

  // Handle form submission
  const handlePayment = async (e) => {
    e.preventDefault();

    // Basic validation
    if (!paymentDetails.cardNumber || !paymentDetails.expiryDate || !paymentDetails.cvv) {
      setError("Please fill in all fields.");
      return;
    }

    try {
      const response = await fetch("http://localhost:8080/api/payments/process", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(paymentDetails),
      });

      if (!response.ok) {
        throw new Error("Payment failed. Please try again.");
      }

      const data = await response.json();
      console.log("Payment Successful:", data);

      alert("Payment Successful!");
      navigate("/order-success"); // Redirect to success page
    } catch (error) {
      console.error("Payment Error:", error);
      setError(error.message);
    }
  };

  return (
    <div className="payment-container">
      <h2>Payment Details</h2>

      {error && <p className="error-message">{error}</p>}

      <form onSubmit={handlePayment} className="payment-form">
        <label>Payment Method</label>
        <select name="paymentMethod" value={paymentDetails.paymentMethod} onChange={handleChange}>
          <option value="Credit Card">Credit Card</option>
          <option value="Debit Card">Debit Card</option>
          <option value="UPI">UPI</option>
        </select>

        <label>Card Number</label>
        <input type="text" name="cardNumber" placeholder="Enter card number" value={paymentDetails.cardNumber} onChange={handleChange} required />

        <div className="multi-fields">
          <div>
            <label>Expiry Date</label>
            <input type="text" name="expiryDate" placeholder="MM/YY" value={paymentDetails.expiryDate} onChange={handleChange} required />
          </div>

          <div>
            <label>CVV</label>
            <input type="password" name="cvv" placeholder="CVV" value={paymentDetails.cvv} onChange={handleChange} required />
          </div>
        </div>

        <button type="submit">Confirm Payment</button>
      </form>
    </div>
  );
};

export default Payment;
