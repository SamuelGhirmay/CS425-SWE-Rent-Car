import React, {useContext, useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {AuthContext} from "../../context";
import {useNavigate} from "react-router";
import { Link } from 'react-router-dom';

const Login = () => {
    const {setIsAuth, setIsAdmin, setIsCustomer} = useContext(AuthContext);
    const navigate = useNavigate();
    const [loginData, setLoginData] = useState({
        email: "",
        password: "",
        user: "customer"
    });
    const login = async event => {
        event.preventDefault();
        setIsAuth(true);
        if(loginData.user === "admin") {
            setIsAdmin(true);
            localStorage.setItem('admin', 'true')
        } else {
            setIsCustomer(true);
            localStorage.setItem('customer', 'true')
        }
        localStorage.setItem('auth', 'true')
        navigate('/');
    }
    function handleInputChange(e) {
        setLoginData({...loginData, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>Login Page</h1>
            <form onSubmit={login}>
                <select name="user" id="user" onChange={handleInputChange} value={loginData.user}>
                    <option key="1" value="customer">customer</option>
                    <option key="2" value="admin">admin</option>
                </select>
                <MyInput name="email" type="text" placeholder="type email" onChange={handleInputChange}/>
                <MyInput name="password" type="password" placeholder="type password" onChange={handleInputChange}/>
                <MyButton>Login</MyButton><br/>
                <span>Don't have an account </span><Link to='/signup'>Sign Up</Link>
            </form>
        </div>
    );
};

export default Login;
