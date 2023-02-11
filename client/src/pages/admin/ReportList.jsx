import { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import { Link } from "react-router-dom";
import MyButton from "../../components/UI/button/MyButton";


const ReportList = () => {
    const [reports, setReports] = useState([]);
    const navigate = useNavigate();
  
    useEffect(() => {
      const fetchData = async () => {
        const reports = [
            {
                id: 1,
                report_url: "url1",
                status: "pending",
                createdAt: '2020-01-12',
                type: "monthly",
            },
            {
                id: 2,
                report_url: "url2",
                status: "finished",
                createdAt: '2020-02-12',
                type: "weekly",
            },
            {
                id: 3,
                report_url: "url3",
                status: "pending",
                createdAt: '2020-03-12',
                type: "monthly",
            },
            {
                id: 4,
                report_url: "url4",
                status: "pending",
                createdAt: '2020-04-12',
                type: "daily",
            },
            {
                id: 5,
                report_url: "url5",
                status: "finished",
                createdAt: '2020-05-12',
                type: "weekly",
            },
            {
                id: 6,
                report_url: "url6",
                status: "pending",
                createdAt: '2020-06-12',
                type: "monthly",
            }]
  
            setReports(reports);
      };
      fetchData();
    }, []);
    
    function handleDelete() {
        console.log("delete")
    }
  
    return (
      <div className='reports'>
        <div>
            <h1>Reports</h1>
            <Link to="/reports/new"><MyButton>Create New Report</MyButton></Link>
        </div>
          <table className="table table-striped">
              <thead>
                <tr>
                    <th>#</th>
                    <th>Type</th>
                    <th>Status</th>
                    <th>Report Url</th>
                    <th>Created Date</th>
                    <th>Actions</th>
                </tr>
              </thead>
              <tbody>
                {reports.map((report, index) => (
                  <tr key={report.id}>
                      <td>{index+1}</td>
                      <td>{report.type}</td>
                      <td>{report.status}</td>
                      <td>{report.report_url}</td>
                      <td>{report.createdAt}</td>
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

export default ReportList;