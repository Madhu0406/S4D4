import React from 'react';
import UserControls from './components/UserControls';
import Cart from './components/Cart';

function App() {
  return (
    <div className="App">
      <h1>E-Commerce Dashboard</h1>
      <UserControls />
      <Cart />
    </div>
  );
}

export default App;
