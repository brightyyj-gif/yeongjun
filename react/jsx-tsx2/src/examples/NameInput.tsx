import React, { useState, type ChangeEvent } from 'react'

function NameInput() {
    const [name, setName] = useState<string>('');
    const onChange = (e:ChangeEvent<HTMLInputElement>) => 
        setName(e.target.value)
  //e 는 HTML <input>에서 발생한 변경이벤트이다.
    return (
    <input 
    className='input' 
    value={name}
    placeholder='이름 (jsx)' 
    onChange={onChange}
    />
  )
}

export default NameInput