import { useState, useEffect } from 'react';


const CustomerHome = () => {
  const [cars, setCars] = useState([]);
  const [discounts, setDiscounts] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const cars = [
          {
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


          setCars(cars);
      const discounts = [
          {
              title: "Winter Sale",
              code: "WINTERSALE2021",
              percentage: 20,
              vehicle: "All vehicles"
          },
          {
              title: "Summer Clearance",
              code: "SUMMERSALE2022",
              percentage: 15,
              vehicle: "Cars"
          },
          {
              title: "Black Friday Deal",
              code: "BLACKFRIDAY2021",
              percentage: 25,
              vehicle: "Trucks and SUVs"
          },
          {
              title: "New Year Special",
              code: "NEWYEAR2022",
              percentage: 10,
              vehicle: "All vehicles"
          },
          {
              title: "Memorial Day Sale",
              code: "MEMORIALDAY2021",
              percentage: 18,
              vehicle: "Cars and Trucks"
          },
          {
              title: "Father's Day Offer",
              code: "FATHERSDAY2022",
              percentage: 12,
              vehicle: "Cars"
          },
          {
              title: "Independence Day Sale",
              code: "INDEPENDENCEDAY2021",
              percentage: 20,
              vehicle: "Trucks and SUVs"
          },
          {
              title: "Labor Day Discount",
              code: "LABORDAY2022",
              percentage: 15,
              vehicle: "All vehicles"
          },
          {
              title: "Back to School Offer",
              code: "BACKTOSCHOOL2021",
              percentage: 10,
              vehicle: "Cars"
          },
          {
              title: "Thanksgiving Day Deal",
              code: "THANKSGIVING2022",
              percentage: 25,
              vehicle: "Trucks and SUVs"
          },
          {
              title: "Cyber Monday Sale",
              code: "CYBERMONDAY2021",
              percentage: 20,
              vehicle: "All vehicles"
          },
          {
              title: "Christmas Special",
              code: "CHRISTMAS2022",
              percentage: 15,
              vehicle: "Cars"
          },
          {
              title: "New Year's Eve Deal",
              code: "NEWYEARSEVE2021",
              percentage: 10,
              vehicle: "All vehicles"
          }];
      setDiscounts(discounts);
    };
    fetchData();
  }, []);

  return (
    <div className='CustomerHome'>
      <h1>Available Cars</h1>
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
              </tr>
            </thead>
            <tbody>
              {cars.map((car, index) => (
                <tr key={index}>
                    <td>{index+1}</td>
                  <td>{car.make}</td>
                  <td>{car.model}</td>
                  <td>{car.year}</td>
                    <td>{car.color}</td>
                    <td>{car.numberOfSeats}</td>
                    <td>{car.fuelType}</td>
                    <td>{car.price}</td>
                    <td>{car.transmission}</td>
                    <td>{car.plateNumber}</td>
                  <td>{car.availability ? 'Available' : 'Not Available'}</td>
                </tr>
              ))}
            </tbody>
        </table>
      <h1>Discounts</h1>
      <table className="table table-striped">
        <thead>
          <tr>
              <th>#</th>
              <th>Title</th>
              <th>Code</th>
            <th>Discount Percentage</th>
              <th>Vehicle</th>
          </tr>
        </thead>
        <tbody>
          {discounts.map((discount, index) => (
            <tr key={index}>
                <td>{index+1}</td>
                <td>{discount.title}</td>
              <td>{discount.code}</td>
              <td>{discount.percentage}%</td>
                <td>{discount.vehicle}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default CustomerHome;