import logo from "./logo.svg";
import "./App.css";
import ClassCounter from "./Hook_componets/ClassCounter";
import HookCounter from "./Hook_componets/HookCounter";
import HookCounterTwo from "./Hook_componets/HookCounterTwo";
import ClassCounterOne from "./UseEffect/ClassCounterOne";
function App() {
  return (
    <div className="App">
      <ClassCounter />
      <HookCounter />
      <HookCounterTwo />
      <ClassCounterOne />
    </div>
  );
}

export default App;
