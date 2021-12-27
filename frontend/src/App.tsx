import './assets/styles/custom.scss';
import './App.css';
import Navbar from 'components/Navbar';

// function App() {
//   return (
//     <>
//       <h1>DS Catalog</h1>;
//     </>
//   );
// }

// Ou utilizando uma função lambda

const App = () => {
  return (
    <>
      <Navbar />
      <h1>DS Catalog</h1>;
    </>
  );
}

export default App;