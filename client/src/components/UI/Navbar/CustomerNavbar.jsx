import React, {useContext, useState} from 'react';
import {Link, useNavigate} from "react-router-dom";
import MyButton from "../button/MyButton";
import {AuthContext} from "../../../context";
import MyModal from '../MyModal/MyModal';
import FeedbackForm from '../../FeedbackForm';

const CustomerNavbar = () => {
    const {setIsAuth, setIsCustomer} = useContext(AuthContext);
    const [modal, setModal] = useState(false);
    const navigate = useNavigate();

    const logout = () => {
        setIsAuth(false);
        setIsCustomer(false);
        localStorage.removeItem('auth')
        localStorage.removeItem('customer')
        navigate("/login");
    }

    const createFeedback = (newFeedback) => {
        console.log(newFeedback);
        setModal(false)
    }

    return (
        <div className="navbar">
             <div className='container'>
                <div className="navbar__links">
                    <Link to="/">Home</Link>
                    <Link to="/info">My Info</Link>
                    <Link to="/reservations">My Reservations</Link>
                    <Link to="/reservations/new">New Reservation</Link>
                </div>
                <div>
                    <MyButton onClick={() => setModal(true)}>
                        Add Feedback
                    </MyButton>
                    <MyModal visible={modal} setVisible={setModal}>
                        <FeedbackForm create={createFeedback}/>
                    </MyModal>
                    <MyButton onClick={logout}>
                        Logout
                    </MyButton>
                </div>
            </div>
        </div>
    );
};

export default CustomerNavbar;
