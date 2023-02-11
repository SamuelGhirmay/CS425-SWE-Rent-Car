import { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import { Link } from "react-router-dom";
import MyButton from "../../components/UI/button/MyButton";

 

const VehiclesList = () => {
    const [vehicles, setVehicles] = useState([]);
    const navigate = useNavigate();
  
    useEffect(() => {
      const fetchData = async () => {
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
      };
      fetchData();
    }, []);

    function handleEdit(id) {
        navigate(`/vehicles/${id}`);
    }
    
    function handleDelete() {
        console.log("delete")
    }
  
    return (
      <div className='vehicles'>
        <div>
            <h1>Vehicles</h1>
            <Link to="/vehicles/new"><MyButton>Create New Vehicle</MyButton></Link>
        </div>
          <table className="table table-striped">
              <thead>
                <tr>
                    <th>#</th>
                    <th>Make</th>
                    <th>Model</th>
                    <th>Year</th>
                    <th>Color</th>
                    <th>Number of seats</th>
                    <th>Fuel type</th>
                    <th>Price</th>
                    <th>Transmission</th>
                    <th>Plate number</th>
                    <th>Availability</th>
                    <th>Actions</th>
                </tr>
              </thead>
              <tbody>
                {vehicles.map((vehicle, index) => (
                  <tr key={index}>
                      <td>{index+1}</td>
                    <td>{vehicle.make}</td>
                    <td>{vehicle.model}</td>
                    <td>{vehicle.year}</td>
                      <td>{vehicle.color}</td>
                      <td>{vehicle.numberOfSeats}</td>
                      <td>{vehicle.fuelType}</td>
                      <td>{vehicle.price}</td>
                      <td>{vehicle.transmission}</td>
                      <td>{vehicle.plateNumber}</td>
                    <td>{vehicle.availability ? 'Available' : 'Not Available'}</td>
                    <td>
                        <MyButton onClick={() => handleEdit(vehicle.id)}>Edit</MyButton>
                        <MyButton onClick={handleDelete}>Delete</MyButton>
                    </td>
                  </tr>
                ))}
              </tbody>
          </table>
      </div>
    );
}

export default VehiclesList;