import * as React from 'react';
import { Login } from '../auth/Login';
import { Register } from '../auth/Register';

export const Home = (): any => {
  // React.useEffect(() => {
  //   console.log('mounted');
  //   fetch('http://localhost:8080/api/bookshelf')
  //     .then(response => response.json())
  //     .then(resData => console.log(resData))
  //     .catch(err => console.log(err));
  // }, []);

  const [count, setCount] = React.useState({
    num: 0,
  });
  console.log(count.num);

  React.useEffect(() => setCount({ ...count, num: 2 }), [count.num]);

  return (
    <div>
      <h1>Home</h1>
      <p>
        Want to sign up?
        <Register />
      </p>
      <p>
        Already Signed up? <Login />
      </p>
    </div>
  );
};
