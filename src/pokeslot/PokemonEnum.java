package pokeslot;

public enum PokemonEnum {

    // ---------------------------- 1º GENERACION ----------------------------
    BULBASAUR(1, "BULBASAUR", Tipo.PocoComun),
    IVYSAUR(2, "IVYSAUR", Tipo.Raro),
    VENUSAUR(3, "VENUSAUR", Tipo.SuperRaro),
    CHARMANDER(4, "CHARMANDER", Tipo.PocoComun),
    CHARMELEON(5, "CHARMELEON", Tipo.Raro),
    CHARIZARD(6, "CHARIZARD", Tipo.SuperRaro),
    SQUIRTLE(7, "SQUIRTLE", Tipo.PocoComun),
    WARTORTLE(8, "WARTORTLE", Tipo.Raro),
    BLASTOISE(9, "BLASTOISE", Tipo.SuperRaro),
    CATERPIE(10, "CATERPIE", Tipo.Comun),
    METAPOD(11, "METAPOD", Tipo.PocoComun),
    BUTTERFREE(12, "BUTTERFREE", Tipo.Raro),
    WEEDLE(13, "WEEDLE", Tipo.Comun),
    KAKUNA(14, "KAKUNA", Tipo.PocoComun),
    BEEDRILL(15, "BEEDRILL", Tipo.Raro),
    PIDGEY(16, "PIDGEY", Tipo.Comun),
    PIDGEOTTO(17, "PIDGEOTTO", Tipo.PocoComun),
    PIDGEOT(18, "PIDGEOT", Tipo.Raro),
    RATTATA(19, "RATTATA", Tipo.Comun),
    RATICATE(20, "RATICATE", Tipo.PocoComun),
    SPEAROW(21, "SPEAROW", Tipo.Comun),
    FEAROW(22, "FEAROW", Tipo.PocoComun),
    EKANS(23, "EKANS", Tipo.Comun),
    ARBOK(24, "ARBOK", Tipo.PocoComun),
    PIKACHU(25, "PIKACHU", Tipo.PocoComun),
    RAICHU(26, "RAICHU", Tipo.Raro),
    SANDSHREW(27, "SANDSHREW", Tipo.Comun),
    SANDSLASH(28, "SANDSLASH", Tipo.PocoComun),
    NIDORAN_F(29, "NIDORAN_F", Tipo.Comun),
    NIDORINA(30, "NIDORINA", Tipo.PocoComun),
    NIDOQUEEN(31, "NIDOQUEEN", Tipo.Raro),
    NIDORAN_M(32, "NIDORAN_M", Tipo.Comun),
    NIDORINO(33, "NIDORINO", Tipo.PocoComun),
    NIDOKING(34, "NIDOKING", Tipo.Raro),
    CLEFAIRY(35, "CLEFAIRY", Tipo.PocoComun),
    CLEFABLE(36, "CLEFABLE", Tipo.Raro),
    VULPIX(37, "VULPIX", Tipo.Comun),
    NINETALES(38, "NINETALES", Tipo.PocoComun),
    JIGGLYPUFF(39, "JIGGLYPUFF", Tipo.Comun),
    WIGGLYTUFF(40, "WIGGLYTUFF", Tipo.PocoComun),
    ZUBAT(41, "ZUBAT", Tipo.Comun),
    GOLBAT(42, "GOLBAT", Tipo.PocoComun),
    ODDISH(43, "ODDISH", Tipo.Comun),
    GLOOM(44, "GLOOM", Tipo.PocoComun),
    VILEPLUME(45, "VILEPLUME", Tipo.Raro),
    PARAS(46, "PARAS", Tipo.Comun),
    PARASECT(47, "PARASECT", Tipo.PocoComun),
    VENONAT(48, "VENONAT", Tipo.Comun),
    VENOMOTH(49, "VENOMOTH", Tipo.PocoComun),
    DIGLETT(50, "DIGLETT", Tipo.Comun),
    DUGTRIO(51, "DUGTRIO", Tipo.PocoComun),
    MEOWTH(52, "MEOWTH", Tipo.Comun),
    PERSIAN(53, "PERSIAN", Tipo.PocoComun),
    PSYDUCK(54, "PSYDUCK", Tipo.Comun),
    GOLDUCK(55, "GOLDUCK", Tipo.PocoComun),
    MANKEY(56, "MANKEY", Tipo.Comun),
    PRIMEAPE(57, "PRIMEAPE", Tipo.PocoComun),
    GROWLITHE(58, "GROWLITHE", Tipo.PocoComun),
    ARCANINE(59, "ARCANINE", Tipo.Raro),
    POLIWAG(60, "POLIWAG", Tipo.Comun),
    POLIWHIRL(61, "POLIWHIRL", Tipo.PocoComun),
    POLIWRATH(62, "POLIWRATH", Tipo.Raro),
    ABRA(63, "ABRA", Tipo.Comun),
    KADABRA(64, "KADABRA", Tipo.PocoComun),
    ALAKAZAM(65, "ALAKAZAM", Tipo.Raro),
    MACHOP(66, "MACHOP", Tipo.Comun),
    MACHOKE(67, "MACHOKE", Tipo.PocoComun),
    MACHAMP(68, "MACHAMP", Tipo.Raro),
    BELLSPROUT(69, "BELLSPROUT", Tipo.Comun),
    WEEPINBELL(70, "WEEPINBELL", Tipo.PocoComun),
    VICTREEBEL(71, "VICTREEBEL", Tipo.Raro),
    TENTACOOL(72, "TENTACOOL", Tipo.Comun),
    TENTACRUEL(73, "TENTACRUEL", Tipo.PocoComun),
    GEODUDE(74, "GEODUDE", Tipo.Comun),
    GRAVELER(75, "GRAVELER", Tipo.PocoComun),
    GOLEM(76, "GOLEM", Tipo.Raro),
    PONYTA(77, "PONYTA", Tipo.Comun),
    RAPIDASH(78, "RAPIDASH", Tipo.PocoComun),
    SLOWPOKE(79, "SLOWPOKE", Tipo.Comun),
    SLOWBRO(80, "SLOWBRO", Tipo.PocoComun),
    MAGNEMITE(81, "MAGNEMITE", Tipo.Comun),
    MAGNETON(82, "MAGNETON", Tipo.PocoComun),
    FARFETCHD(83, "FARFETCHD", Tipo.PocoComun),
    DODUO(84, "DODUO", Tipo.Comun),
    DODRIO(85, "DODRIO", Tipo.PocoComun),
    SEEL(86, "SEEL", Tipo.Comun),
    DEWGONG(87, "DEWGONG", Tipo.PocoComun),
    GRIMER(88, "GRIMER", Tipo.Comun),
    MUK(89, "MUK", Tipo.PocoComun),
    SHELLDER(90, "SHELLDER", Tipo.Comun),
    CLOYSTER(91, "CLOYSTER", Tipo.PocoComun),
    GASTLY(92, "GASTLY", Tipo.Comun),
    HAUNTER(93, "HAUNTER", Tipo.PocoComun),
    GENGAR(94, "GENGAR", Tipo.Raro),
    ONIX(95, "ONIX", Tipo.PocoComun),
    DROWZEE(96, "DROWZEE", Tipo.Comun),
    HYPNO(97, "HYPNO", Tipo.PocoComun),
    KRABBY(98, "KRABBY", Tipo.Comun),
    KINGLER(99, "KINGLER", Tipo.PocoComun),
    VOLTORB(100, "VOLTORB", Tipo.Comun),
    ELECTRODE(101, "ELECTRODE", Tipo.PocoComun),
    EXEGGCUTE(102, "EXEGGCUTE", Tipo.Comun),
    EXEGGUTOR(103, "EXEGGUTOR", Tipo.PocoComun),
    CUBONE(104, "CUBONE", Tipo.Comun),
    MAROWAK(105, "MAROWAK", Tipo.PocoComun),
    HITMONLEE(106, "HITMONLEE", Tipo.Raro),
    HITMONCHAN(107, "HITMONCHAN", Tipo.Raro),
    LICKITUNG(108, "LICKITUNG", Tipo.PocoComun),
    KOFFING(109, "KOFFING", Tipo.Comun),
    WEEZING(110, "WEEZING", Tipo.PocoComun),
    RHYHORN(111, "RHYHORN", Tipo.Comun),
    RHYDON(112, "RHYDON", Tipo.PocoComun),
    CHANSEY(113, "CHANSEY", Tipo.Raro),
    TANGELA(114, "TANGELA", Tipo.PocoComun),
    KANGASKHAN(115, "KANGASKHAN", Tipo.Raro),
    HORSEA(116, "HORSEA", Tipo.Comun),
    SEADRA(117, "SEADRA", Tipo.PocoComun),
    GOLDEEN(118, "GOLDEEN", Tipo.Comun),
    SEAKING(119, "SEAKING", Tipo.PocoComun),
    STARYU(120, "STARYU", Tipo.Comun),
    STARMIE(121, "STARMIE", Tipo.PocoComun),
    MR_MIME(122, "MR_MIME", Tipo.Raro),
    SCYTHER(123, "SCYTHER", Tipo.Raro),
    JYNX(124, "JYNX", Tipo.Raro),
    ELECTABUZZ(125, "ELECTABUZZ", Tipo.Raro),
    MAGMAR(126, "MAGMAR", Tipo.Raro),
    PINSIR(127, "PINSIR", Tipo.Raro),
    TAUROS(128, "TAUROS", Tipo.Raro),
    MAGIKARP(129, "MAGIKARP", Tipo.Comun),
    GYARADOS(130, "GYARADOS", Tipo.Raro),
    LAPRAS(131, "LAPRAS", Tipo.Raro),
    DITTO(132, "DITTO", Tipo.PocoComun),
    EEVEE(133, "EEVEE", Tipo.PocoComun),
    VAPOREON(134, "VAPOREON", Tipo.Raro),
    JOLTEON(135, "JOLTEON", Tipo.Raro),
    FLAREON(136, "FLAREON", Tipo.Raro),
    PORYGON(137, "PORYGON", Tipo.Raro),
    OMANYTE(138, "OMANYTE", Tipo.PocoComun),
    OMASTAR(139, "OMASTAR", Tipo.Raro),
    KABUTO(140, "KABUTO", Tipo.PocoComun),
    KABUTOPS(141, "KABUTOPS", Tipo.Raro),
    AERODACTYL(142, "AERODACTYL", Tipo.Raro),
    SNORLAX(143, "SNORLAX", Tipo.Raro),
    ARTICUNO(144, "ARTICUNO", Tipo.Legendario),
    ZAPDOS(145, "ZAPDOS", Tipo.Legendario),
    MOLTRES(146, "MOLTRES", Tipo.Legendario),
    DRATINI(147, "DRATINI", Tipo.PocoComun),
    DRAGONAIR(148, "DRAGONAIR", Tipo.Raro),
    DRAGONITE(149, "DRAGONITE", Tipo.SuperRaro),
    MEWTWO(150, "MEWTWO", Tipo.Legendario),
    MEW(151, "MEW", Tipo.Legendario);
    
    private int NumeroPokedex;
    private String Nombre;
    private Tipo tipo;
    
    private PokemonEnum(int pokedex, String nombre, Tipo tipo){
        this.NumeroPokedex = pokedex;
        this.Nombre = nombre;
        this.tipo = tipo;
    }

    public int getNumeroPokedex() {
        return NumeroPokedex;
    }

    public String getNombre() {
        return Nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
