import React, { useState } from 'react'

function NameInput() {
    const [name, setName] = useState('');
  return (
    <input
    className='inout'
    value={name}
    placeholder='이름 (jsx)'
    onChange={(e) => setName(e.target.value)}
    />
  )
}

export default NameInput
