import { render, screen, fireEvent } from '@testing-library/react';
import UserControls from '../UserControls';
import { Provider } from 'react-redux';
import { store } from '../../store/store';
import '@testing-library/jest-dom';


test('Login button works and displays user info', () => {
  render(
    <Provider store={store}>
      <UserControls />
    </Provider>
  );

  fireEvent.click(screen.getByText(/login/i));
  expect(screen.getByText(/welcome/i)).toBeInTheDocument();
});
