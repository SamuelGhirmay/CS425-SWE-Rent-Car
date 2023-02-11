import React, {useEffect, useState} from 'react';
import './styles/App.css';
import {BrowserRouter} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.css';
import AppRouter from "./components/AppRouter";
import {AuthContext} from "./context";
import AdminNavbar from './components/UI/Navbar/AdminNavbar';

function App() {
    const [isAuth, setIsAuth] = useState(false);
    const [isLoading, setLoading] = useState(true);

    useEffect(() => {
        if (localStorage.getItem('auth')) {
            setIsAuth(true)
        }
        setLoading(false);
    }, [])

    return (
        <AuthContext.Provider value={{
            isAuth,
            setIsAuth,
            isLoading
        }}>
            <BrowserRouter>
                {isAuth && <AdminNavbar />}
                <AppRouter/>
            </BrowserRouter>
         </AuthContext.Provider>
    )
}

export default App;
