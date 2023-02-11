import { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import { Link } from "react-router-dom";
import MyButton from "../../components/UI/button/MyButton";


const DiscountsList = () => {
  const [discounts, setDiscounts] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      const discounts = [
          {
              id:1,
              title: "Winter Sale",
              code: "WINTERSALE2021",
              percentage: 20,
              vehicle: "All vehicles"
          },
          {
            id:2,
              title: "Summer Clearance",
              code: "SUMMERSALE2022",
              percentage: 15,
              vehicle: "Cars"
          },
          {
            id:3,
              title: "Black Friday Deal",
              code: "BLACKFRIDAY2021",
              percentage: 25,
              vehicle: "Trucks and SUVs"
          },
          {
            id:4,
              title: "New Year Special",
              code: "NEWYEAR2022",
              percentage: 10,
              vehicle: "All vehicles"
          },
          {
            id:5,
              title: "Memorial Day Sale",
              code: "MEMORIALDAY2021",
              percentage: 18,
              vehicle: "Cars and Trucks"
          },
          {
            id:6,
              title: "Father's Day Offer",
              code: "FATHERSDAY2022",
              percentage: 12,
              vehicle: "Cars"
          },
          {
            id:7,
              title: "Independence Day Sale",
              code: "INDEPENDENCEDAY2021",
              percentage: 20,
              vehicle: "Trucks and SUVs"
          },
          {
            id:8,
              title: "Labor Day Discount",
              code: "LABORDAY2022",
              percentage: 15,
              vehicle: "All vehicles"
          },
          {
            id:9,
              title: "Back to School Offer",
              code: "BACKTOSCHOOL2021",
              percentage: 10,
              vehicle: "Cars"
          },
          {
            id:10,
              title: "Thanksgiving Day Deal",
              code: "THANKSGIVING2022",
              percentage: 25,
              vehicle: "Trucks and SUVs"
          },
          {
            id:11,
              title: "Cyber Monday Sale",
              code: "CYBERMONDAY2021",
              percentage: 20,
              vehicle: "All vehicles"
          },
          {
            id:12,
              title: "Christmas Special",
              code: "CHRISTMAS2022",
              percentage: 15,
              vehicle: "Cars"
          },
          {
            id:13,
              title: "New Year's Eve Deal",
              code: "NEWYEARSEVE2021",
              percentage: 10,
              vehicle: "All vehicles"
          }];
      setDiscounts(discounts);
    };
    fetchData();
  }, []);

  function handleEdit(id) {
    navigate(`/discounts/${id}`);
}

function handleDelete() {
    console.log("delete")
}

  return (
    <div className='discounts'>
     <div>
      <h1>Discounts</h1>
      <Link to="/discounts/new"><MyButton>Create New Discount</MyButton></Link>
    </div>
      <table className="table table-striped">
        <thead>
          <tr>
              <th>#</th>
              <th>Title</th>
              <th>Code</th>
              <th>Discount Percentage</th>
              <th>Vehicle</th>
              <th>Actions</th>
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
                <td>
                    <MyButton onClick={() => handleEdit(discount.id)}>Edit</MyButton>
                    <MyButton onClick={handleDelete}>Delete</MyButton>
                </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default DiscountsList;