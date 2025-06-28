import React from 'react';
import { useDispatch, useSelector } from 'react-redux';

const mockUser = {
  id: 1,
  name: 'Madhusmita Sahoo',
  email: 'Madhu@example.com'
};

const UserControls = () => {
  const dispatch = useDispatch();
  const user = useSelector(state => state.user);

  const login = () => dispatch({ type: 'LOGIN', payload: mockUser });
  const logout = () => dispatch({ type: 'LOGOUT' });

  return (
    <div>
      {user ? (
        <>
          <p>Welcome, {user.name}</p>
          <button onClick={logout}>Logout</button>
        </>
      ) : (
        <button onClick={login}>Login</button>
      )}
    </div>
  );
};

export default UserControls;
