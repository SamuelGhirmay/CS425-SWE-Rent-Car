import { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import MyButton from "../../components/UI/button/MyButton";


const CustomersList = () => {
  const [customers, setCustomers] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      const customers = [
        {
        id: 1,
        firstName: 'John',
        lastName: 'Doe',
        email: 'john.doe@gmail.com',
        contactPhoneNumber: '555-555-5555',
        driverLicenseNumber: 'A1234B56789'
        },
        {
        id: 2,
        firstName: 'Jane',
        lastName: 'Smith',
        email: 'jane.smith@gmail.com',
        contactPhoneNumber: '555-555-5556',
        driverLicenseNumber: 'B56789C01234'
        },
        {
        id: 3,
        firstName: 'James',
        lastName: 'Johnson',
        email: 'james.johnson@gmail.com',
        contactPhoneNumber: '555-555-5557',
        driverLicenseNumber: 'C01234D56789'
        },
        {
        id: 4,
        firstName: 'Emily',
        lastName: 'Brown',
        email: 'emily.brown@gmail.com',
        contactPhoneNumber: '555-555-5558',
        driverLicenseNumber: 'D56789E01234'
        },
        {
        id: 5,
        firstName: 'William',
        lastName: 'Davis',
        email: 'william.davis@gmail.com',
        contactPhoneNumber: '555-555-5559',
        driverLicenseNumber: 'E01234F56789'
        },
        {
        id: 6,
        firstName: 'Michael',
        lastName: 'Miller',
        email: 'michael.miller@gmail.com',
        contactPhoneNumber: '555-555-5560',
        driverLicenseNumber: 'F56789G01234'
        },
        {
        id: 7,
        firstName: 'Emily',
        lastName: 'Wilson',
        email: 'emily.wilson@gmail.com',
        contactPhoneNumber: '555-555-5561',
        driverLicenseNumber: 'G01234H56789'
        },
        {
        id: 8,
        firstName: 'David',
        lastName: 'Anderson',
        email: 'david.anderson@gmail.com',
        contactPhoneNumber: '555-555-5562',
        driverLicenseNumber: 'H56789I01234'
        },
        {
        id: 9,
        firstName: 'Christopher',
        lastName: 'Thomas',
        email: 'christopher.thomas@gmail.com',
        contactPhoneNumber: '555-555-5563',
        driverLicenseNumber: 'I01234J56789'
        },
        {
        id: 10,
        firstName: 'Daniel',
        lastName: 'Moore',
        email: 'daniel.moore@gmail.com',
        contactPhoneNumber: '555-555-5564',
        driverLicenseNumber: 'J56789K01234'
        }]
      setCustomers(customers);
    };
    fetchData();
  }, []);

function handleDelete() {
    console.log("delete")
}

  return (
    <div className='customers'>
      <h1>Customers</h1>
      <table className="table table-striped">
        <thead>
          <tr>
              <th>#</th>
              <th>Name</th>
              <th>Email</th>
              <th>Contact Phone</th>
              <th>Driver License</th>
              <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {customers.map((customer, index) => (
            <tr key={index}>
                <td>{customer.id}</td>
                <td>{customer.firstName} {customer.lastName}</td>
                <td>{customer.email}</td>
                <td>{customer.contactPhoneNumber}</td>
                <td>{customer.driverLicenseNumber}</td>
                <td>
                    <MyButton onClick={handleDelete}>Delete</MyButton>
                </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default CustomersList;