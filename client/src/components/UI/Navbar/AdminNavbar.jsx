import React, {useContext} from 'react';
import {Link, useNavigate} from "react-router-dom";
import MyButton from "../button/MyButton";
import {AuthContext} from "../../../context";

const AdminNavbar = () => {
    const {setIsAuth, setIsAdmin} = useContext(AuthContext);
    const navigate = useNavigate();

    const logout = () => {
        setIsAuth(false);
        setIsAdmin(false);
        localStorage.removeItem('auth')
        localStorage.removeItem('admin')
        navigate('/login');
    }


    return (
        <div className="navbar">
            <div className='container'>
            <div className="navbar__links">
                <Link to="/">Home</Link>
                <Link to="/vehicles">Vehicles</Link>
                <Link to="/customers">Customers</Link>
                <Link to="/discounts">Discounts</Link>
                <Link to="/reports">Reports</Link>
            </div>
            <MyButton onClick={logout}>
                Logout
            </MyButton>
            </div>
        </div>
    );
};

export default AdminNavbar;
