import React, {useEffect, useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate, useParams} from "react-router";

const ReservationDetails = () => {

    const { reservationNumber } = useParams();
    const navigate = useNavigate();

    const [reservation, setReservation] = useState({
        startDate: '',
        returnDate: '',
        vehicle: ''
    });

    useEffect(() => {
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
        const reservation = reservations.find(reservation => reservation.reservationNumber == reservationNumber)

        setReservation({
            startDate: reservation.startDate,
            returnDate: reservation.returnDate,
            vehicle: reservation.vehicle.make
        })

    }, [reservationNumber]);



    function handleSubmit()  {
       navigate('/my-reservations');
    }

    function handleInputChange(e) {
        setReservation({...reservation, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>Reservations Details</h1>
            <form onSubmit={handleSubmit}>
                <MyInput name="startDate" type="text" value={reservation.startDate} onChange={handleInputChange} />
                <MyInput name="returnDate" type="text" value={reservation.returnDate} onChange={handleInputChange} />
                <MyInput name="vehicle" type="text" value={reservation.vehicle} placeholder="type vehicle" onChange={handleInputChange} />
                <MyButton>Update</MyButton>
            </form>
        </div>
    );
};

export default ReservationDetails;
