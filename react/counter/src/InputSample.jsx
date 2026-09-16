import { useState } from "react"

function InputSample() {
    const [text, setText] = useState('');

    const onChange = (e) =>{
      setText(e.target.value); // input 키보드를 입력한 값을 가지고와서 text변경
      // console.log(e.target.value)
    }
    // 이벤트가 발생한 input의 값을 가져와서 text라는 state에 넣는다.
    const onReset = () => {
      setText('');
    }
  return (
    <div>
      <input onChange={onChange} value={text}/>
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: {text}</b>
      </div>
      
    </div>
  )
}

export default InputSample
