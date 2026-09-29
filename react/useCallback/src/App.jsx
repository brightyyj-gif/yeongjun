import React, { useState } from 'react'
import { useCallback } from 'react';
import { useMemo } from 'react';

function App() {
  const [number, setNumber] = useState(1);
  const [count, setCount] = useState(0);
  console.log('APP 렌더링');

  const handleClick = useCallback(()=>{
    console.log('현재 숫자 :', number)
  },[number])

  // number만 변경될때 실행
  return (
    <div>
      

      <button onClick={() => setNumber(number + 1)}>number 증가</button>

      <button onClick={() => setCount(count + 1)}>count 증가</button>

      <button onClick={handleClick}>숫자확인</button>

      <p>number: {number}</p>
      <p>count: {count}</p>
    </div>
  )
}

export default App
