import React, {useEffect, useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate} from "react-router";

const NewReservation = () => {

    const navigate = useNavigate();

    const [reservation, setReservation] = useState({
        startDate: '',
        returnDate: '',
        vehicle: ''
    });

    const [vehicles, setVehicles] = useState([]);

    useEffect(() => {
        const fetchVehicles = () => {
            const vehicles = [
                {
                    id: 1,
                    make: "Toyota",
                    model: "Camry",
                    year: 2020,
                    color: "Silver",
                    numberOfSeats: 5,
                    fuelType: "Gasoline",
                    price: 35000,
                    transmission: "Automatic",
                    plateNumber: "ABC123",
                    availability: "Available"
                },
                {
                    id: 2,
                    make: "Honda",
                    model: "Civic",
                    year: 2019,
                    color: "Red",
                    numberOfSeats: 5,
                    fuelType: "Gasoline",
                    price: 30000,
                    transmission: "Manual",
                    plateNumber: "DEF456",
                    availability: "Not Available"
                },
                {
                    id: 3,
                    make: "Tesla",
                    model: "Model S",
                    year: 2022,
                    color: "Blue",
                    numberOfSeats: 5,
                    fuelType: "Electric",
                    price: 100000,
                    transmission: "Automatic",
                    plateNumber: "GHI789",
                    availability: "Available"
                },
                {
                    id: 4,
                    make: "Ford",
                    model: "Mustang",
                    year: 2022,
                    color: "Black",
                    numberOfSeats: 4,
                    fuelType: "Gasoline",
                    price: 60000,
                    transmission: "Automatic",
                    plateNumber: "JKL012",
                    availability: "Available"
                },
                {
                    id: 5,
                    make: "Chevrolet",
                    model: "Camaro",
                    year: 2021,
                    color: "Yellow",
                    numberOfSeats: 4,
                    fuelType: "Gasoline",
                    price: 55000,
                    transmission: "Manual",
                    plateNumber: "MNO345",
                    availability: "Not Available"
                },
                {
                    id: 6,
                    make: "Dodge",
                    model: "Challenger",
                    year: 2020,
                    color: "Red",
                    numberOfSeats: 4,
                    fuelType: "Gasoline",
                    price: 65000,
                    transmission: "Automatic",
                    plateNumber: "PQR678",
                    availability: "Available"
                }]
            setVehicles(vehicles);
        }
        fetchVehicles()
    }, []);



    function handleSubmit()  {
        // submit new reservation
        console.log(reservation);
        navigate('/my-reservations');

    }

    function handleInputChange(e) {
        setReservation({...reservation, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>New Reservations Details</h1>
            <form onSubmit={handleSubmit}>
                <label htmlFor="startDate">Choose start date:</label>
                <MyInput name="startDate" type="datetime-local" value={reservation.startDate} onChange={handleInputChange} /><br/>
                <label htmlFor="returnDate">Choose return date:</label>
                <MyInput name="returnDate" type="datetime-local" value={reservation.returnDate} onChange={handleInputChange} /><br/>
                <label htmlFor="vehicle">Choose available vehicle:</label>
                <select name="vehicle" id="vehicle" onChange={handleInputChange} value={reservation.vehicle}>
                    {vehicles.map((vehicle) => {
                        const { id, make, model, year, color, numberOfSeats, fuelType, price, transmission } = vehicle;
                        return (<option key={id} value={id}>{`${make} ${model}
                        (${color}, ${year}, ${numberOfSeats}, ${fuelType}, ${price}, ${transmission})`}</option>
                    )})}
                </select>
                <MyButton>Add</MyButton>
            </form>
        </div>
    );
};

export default NewReservation;
