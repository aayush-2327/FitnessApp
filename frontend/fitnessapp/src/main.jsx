import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import RegisterForm from "./RegisterForm";
import "./index.css";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RegisterForm />
  </StrictMode>
);
