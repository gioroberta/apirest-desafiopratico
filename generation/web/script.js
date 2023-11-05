function fetchStudents() {
    // Fazer uma solicitação para o backend para buscar os dados dos alunos
    // Substitua a URL com a URL do seu backend
    fetch('http://localhost:8080/api/alunos' +
        '')
        .then(response => response.json())
        .then(data => {
            const listaAlunos = document.getElementById('listaAlunos');
            const tbody = listaAlunos.querySelector('tbody');
            tbody.innerHTML = ''; // Limpar a tabela antes de atualizar

            data.forEach(aluno => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${aluno.id}</td>
                    <td>${aluno.nome}</td>
                    <td>${aluno.idade}</td>
                    <td>${aluno.notaprimeirosemestre}</td>
                    <td>${aluno.notasegundosemestre}</td>
                    <td>${aluno.nomeprofessor}</td>
                    <td>${aluno.numerosala}</td>
                `;
                tbody.appendChild(row);
            });
        })
        .catch(error => console.error('Erro ao buscar dados dos alunos:', error));
}

// Atualize a lista a cada 5 segundos (5000 m           ilissegundos)
setInterval(fetchStudents, 5000);

// Inicialize a lista ao carregar a página
fetchStudents();
