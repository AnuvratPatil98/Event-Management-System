import React from "react";
import {
  Box,
  Container,
  Row,
  Column,
  FooterLink,
  Heading,
} from "./FooterStyles";
import { BsFacebook, BsInstagram, BsTwitter, BsYoutube } from "react-icons/bs";


const Footer = () => {
  return (
    <div
      className="footer"
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <p>©2023 Copyright: Event Management System-CDAC Kochi March 23</p>
    </div>
  );
};
export default Footer;
