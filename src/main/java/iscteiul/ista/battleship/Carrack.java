/**
 *
 */
package iscteiul.ista.battleship;

/**
 * Representa a Nau (Carrack) no jogo Discoveries Battleship.
 */

public class Carrack extends Ship {
    private static final Integer SIZE = 3;
    private static final String NAME = "Nau";

    /**
     * Calcula e adiciona automaticamente as posições ocupadas pelo navio no tabuleiro,
     * baseando-se no seu tamanho fixo (3 casas) e na direção apontada pela bússola.
     *
     * @param bearing A orientação do navio (ex: NORTH, SOUTH, EAST, WEST).
     * @param pos     A posição inicial (coordenada) do navio no tabuleiro.
     * @throws IllegalArgumentException Se a orientação (bearing) fornecida for inválida.
     */
    public Carrack(Compass bearing, IPosition pos) throws IllegalArgumentException {
        super(Carrack.NAME, bearing, pos);
        switch (bearing) {
            case NORTH:
            case SOUTH:
                for (int r = 0; r < SIZE; r++)
                    getPositions().add(new Position(pos.getRow() + r, pos.getColumn()));
                break;
            case EAST:
            case WEST:
                for (int c = 0; c < SIZE; c++)
                    getPositions().add(new Position(pos.getRow(), pos.getColumn() + c));
                break;
            default:
                throw new IllegalArgumentException("ERROR! invalid bearing for the carrack");
        }
    }

    /**
     * Obtém o tamanho da embarcação em número de casas.
     *
     * @return O tamanho da Nau, que corresponde a 3.
     */
    @Override
    public Integer getSize() {
        return Carrack.SIZE;
    }

}
