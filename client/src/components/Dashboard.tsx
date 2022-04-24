import * as React from 'react';

// Login
export const Dashboard = () => {
  // @ts-ignore
  const [apiData, setApiData] = React.useState<any>({
    authors: '',
  });
  React.useEffect(() => {
    fetch('http://localhost:8080/api/bookshelf')
      .then((response: any) => response.json())
      .then((data: any) => {
        setApiData(data);
        console.log(data.authors.robert_greene);
     
      });
    console.count();
  }, []);

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Dashboard</h1>
      <h2>Welcome User</h2>
      {apiData.authors.robert_greene?.map((i: any) => (
        <div key={Math.floor(Math.random() * 10)}>
          <h3>{i}</h3>
        </div>
      ))}
      <button>Logout</button>
    </div>
  );
};
