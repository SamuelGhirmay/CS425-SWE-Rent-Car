import React, {useEffect, useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate, useParams} from "react-router";

const NewDiscount = () => {

    const { id } = useParams();
    const navigate = useNavigate();

    const [discount, setDiscount] = useState({
                title: "",
                code: "",
                percentage: 2023,
                vehicleId: ""
    });
    const [vehicles, setVehicles] = useState([]);

    useEffect(() => {
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

    }, [id]);



    function handleSubmit()  {
       console.log(discount)
       navigate('/discounts');
    }

    function handleInputChange(e) {
        setDiscount({...discount, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>New Discount </h1>
            <form onSubmit={handleSubmit}>
                <label htmlFor="title">Title:</label>
                <MyInput name="title" type="text" value={discount.title} onChange={handleInputChange} /><br/>
                <label htmlFor="code">Code:</label>
                <MyInput name="code" type="text" value={discount.code} onChange={handleInputChange} /><br/>
                <label htmlFor="percentage">Percentage:</label>
                <MyInput name="percentage" type="number" value={discount.percentage} onChange={handleInputChange} /><br/>
                <label htmlFor="price">Vehicle:</label>
                <select name="vehicleId" id="vehicle" onChange={handleInputChange} value={discount.vehicleId}>
                    {vehicles.map((vehicle) => {
                        const { id, make, model, year, color, numberOfSeats, fuelType, price, transmission } = vehicle;
                        return (<option key={id} value={id}>{`${make} ${model}
                        (${color}, ${year}, ${numberOfSeats}, ${fuelType}, ${price}, ${transmission})`}</option>
                    )})}
                </select><br/>
                <MyButton>Create</MyButton>
            </form>
        </div>
    );
};

export default NewDiscount;
