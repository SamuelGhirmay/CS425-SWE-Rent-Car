import React, {useContext} from 'react';
import { Route, Routes } from 'react-router-dom';
import { privateAdminRoutes } from "../router";
import { AuthContext } from "../context";
import Loader from "./UI/Loader/Loader";
import Login from "../pages/customer/Login";
import {ProtectedRoute} from "./ProtectedRoute";
import SignUp from '../pages/customer/SignUp';

const AppRouter = () => {
    const {isAuth, isLoading} = useContext(AuthContext);

    if (isLoading) {
        return <Loader/>
    }
    return (
        <Routes>
            <Route path={'/login'} element={<Login />} />
            <Route path={'/signup'} element={<SignUp />} />
            {privateAdminRoutes.map(route =>
                <Route key={route.path} path={route.path} element={<ProtectedRoute isAuth={isAuth}>{route.component}</ProtectedRoute>} />
            )}
        </Routes>
    );
};

export default AppRouter;
