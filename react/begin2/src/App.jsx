import Hello from "./Hello";
import './App.css';
import Wrapper from "./Wrapper";
function App() {

  return (
    // Hello 컴포넌트를 사용 할 때 name 이라는 값을 전달해주고 싶다고가정
    <Wrapper>
      <Hello name = "react" color="red" isSpecial={true}/>
      <Hello color="pink" />
    </Wrapper>  
  )
}

export default App