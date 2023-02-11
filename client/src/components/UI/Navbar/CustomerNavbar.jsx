import React, {useContext, useState} from 'react';
import {Link} from "react-router-dom";
import MyButton from "../button/MyButton";
import {AuthContext} from "../../../context";
import MyModal from '../MyModal/MyModal';
import FeedbackForm from '../../FeedbackForm';

const CustomerNavbar = () => {
    const {setIsAuth} = useContext(AuthContext);
    const [modal, setModal] = useState(false);

    const logout = () => {
        setIsAuth(false);
        localStorage.removeItem('auth')
        console.log('logout')
    }

    const createFeedback = (newFeedback) => {
        console.log(newFeedback);
        setModal(false)
    }

    return (
        <div className="navbar">
            <div className="navbar__links">
                <Link to="/">Home</Link>
                <Link to="/my-info">My Info</Link>
                <Link to="/my-reservations">My Reservations</Link>
                <Link to="/new-reservation">New Reservation</Link>

                <MyButton style={{marginTop: 30}} onClick={() => setModal(true)}>
                    Add Feedback
                </MyButton>
                <MyModal visible={modal} setVisible={setModal}>
                    <FeedbackForm create={createFeedback}/>
                </MyModal>

            </div>
            <MyButton onClick={logout}>
                Logout
            </MyButton>
        </div>
    );
};

export default CustomerNavbar;
