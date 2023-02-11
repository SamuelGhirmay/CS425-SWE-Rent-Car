import React, {useContext} from 'react';
import {Link} from "react-router-dom";
import MyButton from "../button/MyButton";
import {AuthContext} from "../../../context";

const AdminNavbar = () => {
    const {setIsAuth} = useContext(AuthContext);

    const logout = () => {
        setIsAuth(false);
        localStorage.removeItem('auth')
        console.log('logout')
    }


    return (
        <div className="navbar">
            <div className="navbar__links">
                <Link to="/">Home</Link>
                <Link to="/vehicles">Vehicles</Link>
                <Link to="/customers">Customers</Link>
                <Link to="/discounts">Discounts</Link>
                <Link to="/reports">Reports</Link>

                {/* <MyButton style={{marginTop: 30}} onClick={() => setModal(true)}>
                    Add Feedback
                </MyButton>
                <MyModal visible={modal} setVisible={setModal}>
                    <FeedbackForm create={createFeedback}/>
                </MyModal> */}

            </div>
            <MyButton onClick={logout}>
                Logout
            </MyButton>
        </div>
    );
};

export default AdminNavbar;
