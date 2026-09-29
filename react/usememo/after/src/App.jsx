import React, { useState } from 'react'
import { useMemo } from 'react';

function App() {
  const [number, setNumber] = useState(1);
  const [count, setCount] = useState(0);
  console.log('APP 렌더링');

  const double = useMemo  (()=>{
    console.log('double 계산실행')
    return number * 2;
  },[number]);

  // number만 변경될때 실행
  return (
    <div>
      <h2>결과 : {double}</h2>

      <button onClick={() => setNumber(number + 1)}>number 증가</button>

      <button onClick={() => setCount(count + 1)}>count 증가</button>

      <p>number: {number}</p>
      <p>count: {count}</p>
    </div>
  )
}

export default App
