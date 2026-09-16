
function Card(props) {
  return (
    <div>
      <p>제목: {props.title}</p>
      <p>내용: {props.content}</p>
    </div>
  )
}

export default Card
