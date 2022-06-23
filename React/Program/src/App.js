import logo from "./logo.svg";
import "./App.css";
import ClassCounter from "./Hook_componets/ClassCounter";
import HookCounter from "./Hook_componets/HookCounter";
import HookCounterTwo from "./Hook_componets/HookCounterTwo";

function App() {
  return (
    <div className="App">
      <ClassCounter />
      <HookCounter />
      <HookCounterTwo />
    </div>
  );
}

export default App;
