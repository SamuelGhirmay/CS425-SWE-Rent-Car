import React, {useEffect, useState} from 'react';
import MyInput from "../../components/UI/input/MyInput";
import MyButton from "../../components/UI/button/MyButton";
import {useNavigate, useParams} from "react-router";

const VehicleDetails = () => {

    //const { id } = useParams();
    const navigate = useNavigate();

    const [vehicle, setVehicle] = useState({
                make: "",
                model: "",
                year: 2023,
                color: "",
                numberOfSeats: 4,
                fuelType: "",
                price: 0,
                transmission: "",
                plateNumber: "",
                availability: false
    });

    // useEffect(() => {
        

    // }, [id]);



    function handleSubmit()  {
       console.log(vehicle)
       navigate('/vehicles');
    }

    function handleInputChange(e) {
        setVehicle({...vehicle, [e.target.name]: e.target.value})
    }

    return (
        <div>
            <h1>Vehicles Details</h1>
            <form onSubmit={handleSubmit}>
                <label htmlFor="make">Make:</label>
                <MyInput name="make" type="text" value={vehicle.make} onChange={handleInputChange} /><br/>
                <label htmlFor="model">Model:</label>
                <MyInput name="model" type="text" value={vehicle.model} onChange={handleInputChange} /><br/>
                <label htmlFor="year">Year:</label>
                <MyInput name="year" type="number" value={vehicle.year} onChange={handleInputChange} /><br/>
                <label htmlFor="color">Color:</label>
                <MyInput name="color" type="text" value={vehicle.color} onChange={handleInputChange} /><br/>
                <label htmlFor="numberOfSeats">Number of Seats:</label>
                <MyInput name="numberOfSeats" type="number" value={vehicle.numberOfSeats} onChange={handleInputChange} /><br/>
                <label htmlFor="fuelType">Fuel Type:</label>
                <select name="fuelType" id="fuelType" onChange={handleInputChange} value={vehicle.fuelType}>
                   <option value='gasoline'>Gasoline</option>
                   <option value='diesel'>Diesel</option>
                   <option value='electric'>Electric</option>
                </select><br/>
                <label htmlFor="price">Price:</label>
                <MyInput name="price" type="number" value={vehicle.price} onChange={handleInputChange} /><br/>
                <label htmlFor="transmission">Transmission:</label>
                <select name="transmission" id="transmission" onChange={handleInputChange} value={vehicle.transmission}>
                   <option value='manual'>Manual</option>
                   <option value='automatic'>Automatic</option>
                </select><br/>
                <label htmlFor="plateNumber">Plate Number:</label>
                <MyInput name="plateNumber" type="text" value={vehicle.plateNumber} onChange={handleInputChange} /><br/>
                <label htmlFor="availability">Availability:</label>
                <select name="availability" id="availability" onChange={handleInputChange} value={vehicle.availability}>
                   <option value={false}>Available</option>
                   <option value={true}>Not Available</option>
                </select><br/>
                <MyButton>Update</MyButton>
            </form>
        </div>
    );
};

export default VehicleDetails;
