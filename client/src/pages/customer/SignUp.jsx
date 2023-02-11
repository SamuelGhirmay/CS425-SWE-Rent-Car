import React, {useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate} from "react-router";

const SignUp = () => {
    const navigate = useNavigate();
    const [customer, setCustomer] = useState({
        firstName: '',
        lastName: '',
        email: '',
        password: '',
    })
    const signUp = event => {
        console.log(customer)
        navigate('/login');
    }

    function handleInputChange(e) {
        setCustomer({...customer, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>SignUp Page</h1>
            <form onSubmit={signUp}>
                <label htmlFor="firstName">First Name:</label>
                <MyInput type="text" placeholder="type firstname" name="firstName" value={customer.firstName} onChange={handleInputChange}/><br/>
                <label htmlFor="lastName">Last Name:</label>
                <MyInput type="text" placeholder="type lastname" name="lastName" value={customer.lastName} onChange={handleInputChange}/><br/>
                <label htmlFor="email">Email:</label>
                <MyInput type="email" placeholder="type email" name="email" value={customer.email} onChange={handleInputChange}/><br/>
                <label htmlFor="password">Password:</label>
                <MyInput type="password" placeholder="type password" name="password" value={customer.password} onChange={handleInputChange}/><br/>
                <MyButton>SignUp</MyButton>
            </form>
        </div>
    );
};

export default SignUp;
