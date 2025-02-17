import React from 'react'
import './Footer.css'
import { assets } from '../../assets/assets'

const Footer = () => {
    return (
        <div className='footer' id='footer'>
            <div className="footer-content">
                <div className="footer-content-left">
                    <img src={assets.logo1} alt="" />
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Fugit porro nulla corrupti qui dolorum placeat quidem architecto incidunt quos error magni dolores nostrum, sint accusamus. Corrupti, vel officiis. Praesentium, itaque?</p>
                    <div className="footer-social-icons">
                       <img src={assets.facebook_icon} alt="" />
                       <img src={assets.twitter_icon} alt="" />
                       <img src={assets.linkedin_icon} alt="" />
                    </div>
                </div>
                <div className="footer-content-center">
                    <h2>COMPANY</h2>
                    <ul>
                        <li>Home</li>
                        <li>About Us</li>
                        <li>Delivery</li>
                        <li>Privacy Policy</li>
                    </ul>
                </div>
                <div className="footer-content-right">
                    <h2>GET IN TOUCH</h2>
                    <ul>
                        <li>+91 7834659269</li>
                        <li>hungerix@gmail.com</li>
                    </ul>
                </div>
            </div>
            <hr />
            <p className="footer-copyright">
                copyright 2025 Hungerix.com - All Rights Reserved
            </p>
        </div>
    )
}

export default Footer
