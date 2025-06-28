import React from 'react';
import { useSelector } from 'react-redux';

const Cart = () => {
  const cart = useSelector(state => state.cart);
  const total = cart.reduce((sum, item) => sum + item.price, 0);

  return (
    <div>
      <h3>Cart ({cart.length} items)</h3>
      <p>Total: ₹{total}</p>
    </div>
  );
};

export default Cart;
