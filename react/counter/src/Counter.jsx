import { useState } from 'react';

function Counter() {

    const[number, setNumber] = useState(0);
    // 컴포넌트에서 동적인 값을 상태(state) - 리액트 useState 함수
    // 가 컴포넌트에서 상태를 관리 할 수 있다.

    const onIncrease = () =>{
        // console.log('+1')
        setNumber(number + 1);
    }
    const onDecrease = () =>{
        // console.log('-1')
        setNumber(number - 1);
    }

    const reset = () =>{
        setNumber(0);
    }

  return (
    <div>
        <h1>{number}</h1>
        <button onClick={onIncrease}>+1</button>
        <button onClick={onDecrease}>-1</button>
        <button onClick={reset}>리셋</button>
    </div>
  )
}

export default Counter
