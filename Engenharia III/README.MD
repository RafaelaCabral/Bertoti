<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
    </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Encapsular uma familia de algoritmos e tornar intercambiável através de polimorfismo</td>
        <td>Herança que duplica código</td>
        <td>Usado em Java para Ordenação de coleções, Processamento de arquivos, Algoritmos de criptografia, Comportamento de validação, Implementação de algoritmos complexos, etc</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Alto acoplamento</td>
        <td> Classe abstrata Observer, permite definir um mecanismo de assinatura para notificar vários objetos sobre quaisquer eventos que ocorram com o objeto que eles estão observando</td>
        <td>Evita o Alto acoplamento e torna o código baixo acoplado, evitando que fiquem de certo modo indistinguíveis</td>
        <td>Usado em Java para classe abstrata  abserver switch, MVC, Tratamento de eventos, Padrões de designer, Gerenciamento de dados, etc</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Código de grande complexidade, difícil manutenção</td>
        <td>Usado quando é necessário implementar uma estrutura de objeto semelhante a uma árvore.</td>
        <td>Evita a duplicação de código, usando o polimorfismo, e usa recursão, o que é essencial para a estrura em árvore, para separar o problema em partes, e resolve cada parte chamando uma cópia de si mesma.</td>
        <td>O padrão Composite é o Gui com Java Swing. Usado em Java para criar uma estrutura hierárquica de objetos de maneira que os objetos individuais e compostos possam ser tratados de maneira uniforme.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>Uma única classe ou objeto assume muitas responsabilidades, tornando-o difícil de entender e modificar</td>
        <td>Ter métodos ou classes de fachada que usam funcionalidades encapsuladas em outros lugares, o lance é encapsulamento, ele resolve o DRIY(Dont repete yourself),  não repete o código.</td>
        <td>Resolve o problema de lidar com sistemas complexos, ocultando a complexidade dos clientes.</td>
        <td>Usado em Java em bibliotecas de persistência de dados, como o Hibernate, onde uma fachada simplificada é fornecida para interagir com o sistema de gerenciamento de banco de dados subjacente, ocultando a complexidade das consultas SQL e outras operações.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias da classe parecem compartilhar o mesmo estado</td>
        <td>O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância</td>
        <td>Resolve o problema de garantir que uma classe tenha apenas uma única instância durante toda a vida útil do programa.</td>
        <td>A classe Calender usa singleton, ele é também em Java para o gerenciamento de Conexões de banco de dados, Pools de objetos, Caches, Registros de log, Configurações de aplicativos, etc</td>
    </tr>
</table>
