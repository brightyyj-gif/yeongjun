import { useState, useCallback } from 'react';

function Example3() {
  const [count, setCount] = useState(0);

  const handleIncrease = useCallback(() => {
    setCount((c) => c + 1);
  }, []);

  const handleDecrease = useCallback(() => {
    setCount((c) => c - 1);
  }, []);
  // 함수컴포넌트가 처음 생성될 때 한 번만 만들어지고 example3가 리렌더링 되더라도 의존성 배열을 비워 놓으면 재생성 되지않고 똑같은 메모리 주소를 유지

  return (
    <div className="example-box">
      <h3>예제 1: useCallback - 이벤트 핸들러</h3>
      <p>함수형 업데이트 setCount(c =&gt; c + 1) 사용 → 의존성 [] 가능</p>
      <p><strong>count: {count}</strong></p>
      <button className="btn btn-primary" onClick={handleIncrease}>+1</button>
      <button className="btn btn-primary" onClick={handleDecrease}>-1</button>
      <div className="log">💡 handleIncrease, handleDecrease는 항상 같은 참조</div>
    </div>
  );
}

export default Example3;