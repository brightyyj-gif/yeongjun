import { useState } from "react";

function InputSamples() {
    const[inputs, setInputs] = useState({
        name:'',
        nickname:''
    });  // inputs라는 state를 객체로 만든다.

    const {name, nickname} = inputs; // 구조분해할당 (비구조화 할당) 통해서 추출
    // inputs 객체에서 값을 꺼낸다.

    const onChange = (e) =>{
        const{value, name} = e.target; // 우선 e.target에서 name과 value를 추출
        setInputs({
            ...inputs, // 기존의 input 객체를 복사한 뒤
            [name] : value // name키를 
        });
    }; 

    const onReset = () =>{
        setInputs({
            name:'',
            nickname:''
        });
    };
  return (
    <div>
      <input placeholder="이름" name='name' onChange={onChange} value={name}/>
      <input placeholder="닉네임" name= 'nickname' onChange={onChange} value={nickname}/>
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: </b>
        {name} ({nickname})
      </div>
    </div>
  )
}

export default InputSamples
