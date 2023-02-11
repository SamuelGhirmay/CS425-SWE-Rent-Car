import React, {useContext} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {AuthContext} from "../../context";
import {useNavigate} from "react-router";
import { Link } from 'react-router-dom';

const Login = () => {
    const {setIsAuth} = useContext(AuthContext);
    const navigate = useNavigate();
    const login = event => {
        event.preventDefault();
        setIsAuth(true);
        localStorage.setItem('auth', 'true')
        navigate('/admin');
    }

    return (
        <div>
            <h1>Login Page</h1>
            <form onSubmit={login}>
                <MyInput type="text" placeholder="type username"/>
                <MyInput type="password" placeholder="type password"/>
                <MyButton>Login</MyButton><br/>
                <span>Don't have an account </span><Link to='/signup'>Sign Up</Link>
            </form>
        </div>
    );
};

export default Login;
