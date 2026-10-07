import React, { useState, type ChangeEvent } from 'react'

function NameInput() {
    const [name, setName] = useState<string>('');
    const onChange = (e:ChangeEvent<HTMLInputElement>) => setName(e.target.value);
  return (
    <input
    className='inout'
    value={name}
    placeholder='이름 (jsx)'
    onChange={onChange}
    />
  )
}

export default NameInput
