import { useState, useEffect } from 'react';
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate} from "react-router";


const MyReservations = () => {
    const [reservations, setReservations] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        const fetchData = async () => {
            const reservations = [
                {
                    reservationNumber: 1,
                    startDate: "2022-01-02",
                    returnDate: "2022-01-07",
                    rentalCharge: 500,
                    insuranceCharge: 50,
                    status: "Active",
                    vehicle: {
                        make: "Toyota",
                        model: "Camry",
                        year: 2022,
                        color: "White",
                        numberOfSeats: 5,
                        fuelType: "Gasoline",
                        price: 35000
                    },
                    created_at: "2022-01-01"
                },
                {
                    reservationNumber: 2,
                    startDate: "2022-02-01",
                    returnDate: "2022-02-05",
                    rentalCharge: 400,
                    insuranceCharge: 40,
                    status: "Completed",
                    vehicle: {
                        make: "Honda",
                        model: "Civic",
                        year: 2022,
                        color: "Silver",
                        numberOfSeats: 5,
                        fuelType: "Gasoline",
                        price: 30000
                    },
                    created_at: "2022-01-31"
                },
                {
                    reservationNumber: 3,
                    startDate: "2022-03-01",
                    returnDate: "2022-03-03",
                    rentalCharge: 300,
                    insuranceCharge: 30,
                    status: "Active",
                    vehicle: {
                        make: "Tesla",
                        model: "Model 3",
                        year: 2022,
                        color: "Black",
                        numberOfSeats: 5,
                        fuelType: "Electric",
                        price: 55000
                    },
                    created_at: "2022-02-28"
                },
                {
                    reservationNumber: 4,
                    startDate: "2022-04-01",
                    returnDate: "2022-04-02",
                    rentalCharge: 200,
                    insuranceCharge: 20,
                    status: "Cancelled",
                    vehicle: {
                        make: "Ford",
                        model: "Mustang",
                        year: 2022,
                        color: "Red",
                        numberOfSeats: 4,
                        fuelType: "Gasoline",
                        price: 45000
                    },
                    created_at: "2022-03-31"
                },
                {
                    reservationNumber: 5,
                    startDate: "2022-05-01",
                    returnDate: "2022-05-05",
                    rentalCharge: 500,
                    insuranceCharge: 50,
                    status: "Active",
                    vehicle: {
                        make: "Chevrolet",
                        model: "Camaro",
                        year: 2022,
                        color: "Yellow",
                        numberOfSeats: 4,
                        fuelType: "Gasoline",
                        price: 40000
                    },
                    created_at: "2022-04-30"
                }]


            setReservations(reservations);
        };
        fetchData();
    }, []);

    function handleEdit(id) {
        navigate(`/reservations/${id}`);
    }

    function handleDelete() {
        console.log("delete")
    }

    return (
        <div className='Home'>
            <h1>My Reservations</h1>
            <table className="table table-striped">
                <thead>
                <tr>
                    <th>Reservation number</th>
                    <th>Start date</th>
                    <th>Return date</th>
                    <th>Rental charge</th>
                    <th>Insurance charge</th>
                    <th>Status</th>
                    <th>Vehicle</th>
                    <th>Created date</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                {reservations.map((res, index) => (
                    <tr key={index}>
                        <td>{res.reservationNumber}</td>
                        <td>{res.startDate}</td>
                        <td>{res.returnDate}</td>
                        <td>{res.rentalCharge}</td>
                        <td>{res.insuranceCharge}</td>
                        <td>{res.status}</td>
                        <td>{res.vehicle.make}</td>
                        <td>{res.created_at}</td>
                        <td>
                            <MyButton onClick={() => handleEdit(res.reservationNumber)}>Edit</MyButton>
                            <MyButton onClick={handleDelete}>Delete</MyButton>
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default MyReservations;