import { render, screen } from '@testing-library/react';
import App from './App';

// test('renders learn react link', () => {
//   render(<App />);
//   const linkElement = screen.getByText(/learn react/i);
//   expect(linkElement).toBeInTheDocument();
// });

// import React from 'react';
// import { render, screen, fireEvent } from '@testing-library/react';
// import MyComponent from './MyComponent'; // Replace './MyComponent' with the path to your component

// describe('MyComponent', () => {
//   it('renders the component with default props', () => {
//     render(<MyComponent />);
//     expect(screen.getByText('Hello, World!')).toBeInTheDocument();
//   });

//   it('renders the component with custom props', () => {
//     render(<MyComponent greeting="Hola" />);
//     expect(screen.getByText('Hola, World!')).toBeInTheDocument();
//   });

//   it('updates state on button click', () => {
//     render(<MyComponent />);
//     const button = screen.getByRole('button');
//     fireEvent.click(button);
//     expect(screen.getByText('Button clicked!')).toBeInTheDocument();
//   });

//   it('renders error message when required prop is missing', () => {
//     const { container } = render(<MyComponent />);
//     expect(container.textContent).toMatch(/Required prop .* was not provided/);
//   });

//   it('renders additional content when prop is provided', () => {
//     render(<MyComponent additionalContent="Additional content" />);
//     expect(screen.getByText('Additional content')).toBeInTheDocument();
//   });

//   it('disables button based on prop', () => {
//     render(<MyComponent disableButton />);
//     const button = screen.getByRole('button');
//     expect(button).toBeDisabled();
//   });

//   it('renders loading state', () => {
//     render(<MyComponent isLoading />);
//     expect(screen.getByText('Loading...')).toBeInTheDocument();
//   });

//   it('renders error state', () => {
//     render(<MyComponent isError />);
//     expect(screen.getByText('Error!')).toBeInTheDocument();
//   });

//   it('renders empty state when no data is available', () => {
//     render(<MyComponent />);
//     expect(screen.getByText('No data available.')).toBeInTheDocument();
//   });

//   it('renders list of items', () => {
//     const items = ['Item 1', 'Item 2', 'Item 3'];
//     render(<MyComponent items={items} />);
//     items.forEach(item => {
//       expect(screen.getByText(item)).toBeInTheDocument();
//     });
//   });

//   it('calls a function prop when button is clicked', () => {
//     const onClick = jest.fn();
//     render(<MyComponent onClick={onClick} />);
//     const button = screen.getByRole('button');
//     fireEvent.click(button);
//     expect(onClick).toHaveBeenCalled();
//   });

//   it('matches snapshot', () => {
//     const { container } = render(<MyComponent />);
//     expect(container).toMatchSnapshot();
//   });

//   it('renders correctly with RTL (Right-to-Left) language', () => {
//     render(<MyComponent rtl />);
//     expect(screen.getByText('!dlroW ,olleH')).toBeInTheDocument();
//   });

//   // Add more diverse test cases as needed...
// });


test("text search", ()=>{
render(<App />);
const text=screen.getByText("first test");
expect(text).toBeInTheDocument();
});









