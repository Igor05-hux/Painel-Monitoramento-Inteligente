import { useEffect, useState } from "react";

function App() {

  const API = "http://localhost:3307";

  const [usuarios, setUsuarios] = useState([]);
  const [dispositivos, setDispositivos] = useState([]);
  const [eventos, setEventos] = useState([]);

  useEffect(() => {
    carregarUsuarios();
    carregarDispositivos();
    carregarEventos();
  }, []);

  const carregarUsuarios = async () => {
    const response = await fetch(`${API}/usuarios`);
    const data = await response.json();
    setUsuarios(data);
  };

  const carregarDispositivos = async () => {
    const response = await fetch(`${API}/dispositivos`);
    const data = await response.json();
    setDispositivos(data);
  };

  const carregarEventos = async () => {
    const response = await fetch(`${API}/eventos`);
    const data = await response.json();
    setEventos(data);
  };

  return (
    <div style={{ padding: 40, fontFamily: "Arial" }}>

      <h1>Painel de Monitoramento Inteligente</h1>

      <h2>Usuários</h2>
      <ul>
        {usuarios.map(u => (
          <li key={u.id}>
            {u.nome} - {u.email} - {u.status}
          </li>
        ))}
      </ul>

      <h2>Dispositivos</h2>
      <ul>
        {dispositivos.map(d => (
          <li key={d.id}>
            {d.nome} - {d.tipo} - {d.status}
          </li>
        ))}
      </ul>

      <h2>Eventos</h2>
      <ul>
        {eventos.map(e => (
          <li key={e.id}>
            {e.tipo} - {e.localEvento} - {e.status}
          </li>
        ))}
      </ul>

    </div>
  );
}

export default App;