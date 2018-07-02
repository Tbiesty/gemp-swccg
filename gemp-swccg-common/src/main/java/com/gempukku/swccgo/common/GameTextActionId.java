package com.gempukku.swccgo.common;

/**
 * Used by cards to identify game text actions that are "once per ..." or that search card piles.
 */
public enum GameTextActionId {
    // Used for card actions that are not searching a card pile and not "per game", "per captive", nor "per Force drain"
    OTHER_CARD_ACTION_DEFAULT, // Default value
    OTHER_CARD_ACTION_1,
    OTHER_CARD_ACTION_2,
    OTHER_CARD_ACTION_3,
    OTHER_CARD_ACTION_4,
    OTHER_CARD_ACTION_5,
    OTHER_CARD_ACTION_6,
    OTHER_CARD_ACTION_7,

    // Used for card action that causes other cards to deploy as a 'react'
    OTHER_CARD_ACTION_REACT_DEPLOY_OTHER_CARDS,
    // Used for card action that causes other cards to move as a 'react'
    OTHER_CARD_ACTION_REACT_MOVE_OTHER_CARDS,
    // Used for card action that causes other cards to move away as a 'react'
    OTHER_CARD_ACTION_REACT_MOVE_AWAY_OTHER_CARDS,

    // Search card pile
    _4_LOM__SEARCH_USED_PILE(true),
    A_DANGEROUS_TIME__UPLOAD_DARK_FORCES(true),
    A_DARK_TIME_FOR_THE_REBELLION__DOWNLOAD_RELATED_SYSTEM(true),
    A_NEW_SECRET_BASE__DOWNLOAD_BATTLEGROUND_SYSTEM(true),
    A_NEW_SECRET_BASE__UPLOAD_ECHO_CARDS_OR_PLANET_SYSTEM(true),
    A_REAL_HERO__UPLOAD_LOBOT(true),
    A_STEP_BACKWARD__UPLOAD_CHARACTER_FROM_LOST_PILE(true),
    AAT_ASSAULT_LEADER__DOWNLOAD_ENERGY_SHELL_LAUNCHERS(true),
    ABILITY_ABILITY_ABILITY__RETRIEVE_TOPMOST_CHARACTER(true),
    ABYSSIN_ORNAMENT__UPLOAD_NON_UNIQUE_ALIEN(true),
    AKREV__UPLOAD_MUSICIAN(true),
    ALDERAAN_OPERATIVE__DOWNLOAD_SITE_TO_ALDERAAN(true),
    ALERT_MY_STAR_DESTROYER__DEPLOY_MATCHING_STAR_DESTROYER_OR_PILOT(true),
    ALL_POWER_TO_WEAPONS__UPLOAD_NON_UNIQUE_TIES(true),
    ALL_WINGS_REPORT_IN__UPLOAD_NON_UNIQUE_STARFIGHTER(true),
    ALL_WINGS_REPORT_IN__UPLOAD_UNIQUE_STARFIGHTER(true),
    AMBUSH__UPLOAD_TROOPERS(true),
    ANOAT_OPERATIVE__DOWNLOAD_SITE_TO_ANOAT(true),
    ANTILLES_MANEUVER__DOWNLOAD_REBEL_ABOARD_YOUR_STARSHIP(true),
    ANTILLES_MANEUVER__UPLOAD_CORELLIAN_SLIP(true),
    ANY_METHODS_NECESSARY__UPLOAD_OR_DOWNLOAD_CARD(true),
    ARATECH_CORPORATION__DEPLOY_ATST_SPEEDER_BIKE_OR_PILOT(true),
    ARLEIL_SCHOUS__UPLOAD_ALIEN(true),
    ARTOO__UPLOAD_HERO_OF_A_THOUSAND_DEVICES_OR_A_GIFT(true),
    ARTOO_AND_THREEPIO__UPLOAD_BAD_FEELING(true),
    ARTOO_COME_BACK_AT_ONCE__RETRIEVE_R2D2(true),
    ARTOO_COME_BACK_AT_ONCE__UPLOAD_HERO_OF_A_THOUSAND_DEVICES(true),
    ARTOO_COME_BACK_AT_ONCE__UPLOAD_R2D2(true),
    AUDIENCE_CHAMBER__DOWNLOAD_BO_SHUDA(true),
    AVED_LUUN__UPLOAD_UTINNI_OR_JAWA(true),
    BALANCED_ATTACK__UPLOAD_ADMIRAL_OR_GENERAL(true),
    BANTHA_FODDER__UPLOAD_CARD(true),
    BARAGWIN__EXCHANGE_CARD_IN_HAND_WITH_CARD_IN_LOST_PILE(true),
    BATTLE_DEPLOYMENT__DOWNLOAD_COMBAT_VEHICLE(true),
    BEGIN_LANDING_YOUR_TROOPS__DOWNLOAD_DOCKING_BAY(true),
    BEN_KENOBI__REVIVE_CHARACTER(true),
    BIG_BOOMERS__UPLOAD_FAMBAA_OR_BOOMA(true),
    BIKER_SCOUT_TROOPER__DOWNLOAD_SPEEDER_BIKE(true),
    BLACK_2__UPLOAD_PRIDE_OF_THE_EMPIRE(true),
    BLAST_POINTS__DOWNLOAD_CHARACTER_WEAPON(true),
    BLASTER_RACK__DOWNLOAD_MATCHING_WEAPON(true),
    BLIZZARD_2__UPLOAD_TRAMPLE_OR_WALKER_BARRAGE(true),
    BLIZZARD_4__DOWNLOAD_IMPERIAL_WARRIOR(true),
    BOSS_NASS__DOWNLOAD_GUNGAN_OR_STEADY_STEADY(true),
    BOTHAWUI_OPERATIVE__DOWNLOAD_SITE_TO_BOTHWAUI(true),
    BOW_TO_THE_FIRST_ORDER__UPLOAD_CARD_FROM_USED_PILE(true),
    BRING_HIM_BEFORE_ME__DOWNLOAD_EMPEROR(true),
    BRING_HIM_BEFORE_ME__DOWNLOAD_LUKE(true),
    BRING_HIM_BEFORE_ME__DOWNLOAD_LUKE_FROM_LOST_PILE(true),
    CAMIE__DOWNLOAD_LUKE_BIGGS_OR_FIXER(true),
    CAPTAIN_BEWIL__UPLOAD_INTERRUPT_FROM_FORCE_PILE(true),
    CAPTAIN_BEWIL__UPLOAD_LASER_GATE_HEART_OF_THE_CHASM_OR_RITE_OF_PASSAGE(true),
    CAPTAIN_KHURGEE__UPLOAD_SCANNING_CREW(true),
    CAPTAIN_PIETT__UPLOAD_PROBE_DROID(true),
    CAPTAIN_YUTANI__DOWNLOAD_ARTILLERY_WEAPON_OR_PORTABLE_FUSION_GENERATOR(true),
    CARBON_CHAMBER_TESTING__DOWNLOAD_AUDIENCE_CHAMBER_DOCKING_BAY_94_OR_EAST_PLATFORM(true),
    CARBONITE_CHAMBER_CONSOLE__UPLOAD_UGNAUGHT_PREPARE_THE_CHAMBER_OR_CARBON_FREEZING(true),
    CHALL_BEKAN__UPLOAD_ALIEN(true),
    CHANGING_THE_ODDS__SEARCH_OPPONENT_RESERVE_DECK(true),
    CHEWBACCA_OF_KASHYYYK__DOWNLOAD_LUMAT_OR_WUTA(true),
    CHIEF_CHIRPA__DOWNLOAD_EWOK(true),
    CHIRRUT_IMWE__UPLOAD_OR_RETRIEVE_BAZE(true),
    CITY_IN_THE_CLOUDS__DOWNLOAD_CLOUD_CITY_BATTLEGROUND_SITE(true),
    CIVIL_DISORDER__RETRIEVE_TOPMOST_CHARACTER(true),
    CLAKDOR_VII_OPERATIVE__DOWNLOAD_SITE_TO_CLAKDOR_VII(true),
    CLASH_OF_SABERS__UPLOAD_UNCONTROLLABLE_FURY(true),
    COLONEL_JENDON_IN_ONYX_1__DOWNLOAD_WEAPON_ON_ONYX_1(true),
    COMBAT_RESPONSE__DEPLOY_MATCHING_STARFIGHTER_OR_PILOT(true),
    COMBINED_FLEET_ACTION__DOWNLOAD_COMBAT_VEHICLE(true),
    COMMANDER_BRANDEI__UPLOAD_TIE(true),
    COMMANDER_DESANNE__UPLOAD_LAMBDA_SHUTTLE_OR_LANDING_CRAFT(true),
    COMMANDER_GHERANT__UPLOAD_EXECUTOR_SITE(true),
    COMMANDER_LUKE_SKYWALKER__UPLOAD_SPEEDER_OR_T47_CARD(true),
    COMMANDER_MERREJK__DOWNLOAD_BATTLEGROUND_SYSTEM(true),
    COMMANDER_WEDGE_ANTILLES__UPLOAD_ONE_MORE_PASS(true),
    CONDUCT_YOUR_SEARCH__DOWNLOAD_CARD_WITH_DOOR_IN_TITLE(true),
    CORELLIA_OPERATIVE__DOWNLOAD_SITE_TO_CORELLIA(true),
    CORELLIAN_RETORT__UPLOAD_CAPTIVE_FURY_OR_CAPTIVE_PURSUIT(true),
    CORPORAL_BEEZER__DOWNLOAD_DEVICE(true),
    CORPORAL_DERDRAM__UPLOAD_IT0_OR_HYPO(true),
    CORPORAL_DRAZIN__UPLOAD_SPECIAL_DELIVERY(true),
    CORPORAL_VANDOLAY__UPLOAD_SPICE_MINES_OF_KESSEL_OR_DETENTION_BLOCK_CORRIDOR(true),
    CORULAG_OPERATIVE__DOWNLOAD_SITE_TO_CORULAG(true),
    COURT_OF_THE_VILE_GANGSTER__DOWNLOAD_DOCKING_BAY_OR_INDEPENDENT_STARSHIP(true),
    COVERT_INTELLIGENCE__DOWNLOAD_OPERATIVE(true),
    COVERT_OPERATIONS__DOWNLOAD_OPERATIVE(true),
    COVERT_LANDING__DOWNLOAD_SCOUTS_AND_WEAPONS(true),
    CRUSH_THE_REBELLION__UPLOAD_I_HAVE_YOU_NOW_OR_EVADER(true),
    DAGOBAH__DOWNLOAD_DAGOBAH_SITE(true),
    DAGOBAH_TRAINING_AREA__UPLOAD_JEDI_TEST(true),
    DAMS_DENNA__DOWNLOAD_KAADU_FAMBAA_OR_EOPIE(true),
    DANTOOINE_BASE_OPERATIONS__DOWNLOAD_SITE_OR_NONUNIQUE_REBEL_TO_DANTOOINE(true),
    DANTOOINE_OPERATIVE__DOWNLOAD_SITE_TO_DANTOOINE(true),
    DAROE__DOWNLOAD_DROID_OR_RETRAINING_BOLT(true),
    DAUGHTER_OF_SKYWALKER__DOWNLOAD_REFLECTION(true),
    DEATH_STAR_GUNNER__UPLOAD_SUPERLASER(true),
    DESILIJIC_TATTOO__UPLOAD_JABBAS_INFLUENCE_OR_DEATH_MARK(true),
    DESPERATE_COUNTER__DOWNLOAD_COMBAT_RESPONSE_OR_IMPERIAL_ARREST_ORDER(true),
    DETENTION_BLOCK_CORRIDOR__DOWNLOAD_IT0_OR_HYPO(true),
    DFS_SQUADRON_STARFIGHTER__DOWNLOAD_DROID_STARFIGHTER_LASER_CANNONS(true),
    DIPLOMATIC_MISSION_TO_ALDERAAN__DOWNLOAD_ALDERAAN_OR_TATOOINE_BATTLEGROUND_SITE(true),
    DOCKING_CONTROL_ROOM_327__DOWNLOAD_DOCKING_BAY(true),
    DONT_TREAD_ON_ME__DOWNLOAD_EFFECT(true),
    DOUBLE_BACK__RETRIEVE_BOUNTY_HUNTER(true),
    DOUBLE_BACK__UPLOAD_4LOM_BOBA_FETT_DANZ_BORIN_OR_DENGAR(true),
    DOUBLE_BACK__UPLOAD_BOUNTY_HUNTER(true),
    DS_181_4__UPLOAD_UNIQUE_TIE_INTERCEPTOR(true),
    DS_61_4__UPLOAD_LONE_PILOT(true),
    DS_61_5__UPLOAD_CARD_FROM_FORCE_PILE(true),
    EARLY_WARNING_NETWORK__DOWNLOAD_IMPERIAL_STARSHIP_AS_REACT(true),
    ECHO_BASE_GARRISON__UPLOAD_CARD(true),
    ELLO_ASTY__UPLOAD_SABOTAGE(true),
    EMPEROR_PALPATINE__UPLOAD_FORCE_LIGHTNING(true),
    ENDOR_OPERATIONS__UPLOAD_OMIMOUS_RUMORS_OR_ESTABLISH_SECRET_BASE(true),
    ERIADU_OPERATIVE__DOWNLOAD_SITE_TO_ERIADU(true),
    ESCAPE_POD__UPLOAD_DEJARIK(true),
    ESCAPE_POD__UPLOAD_DEJARIK_OR_HOLOSITE(true),
    ESTABLISH_SECRET_BASE__DOWNLOAD_ENDOR_SITE(true),
    EV9D9__UPLOAD_POWER_DROID_OR_TORTURE(true),
    FALL_OF_THE_LEGEND__UPLOAD_WEATHER_VANE(true),
    FARM__DOWNLOAD_HYDROPONICS_STATION_OR_VAPORATOR(true),
    FIREPOWER__DOWNLOAD_WEAPON_FROM_LOST_PILE(true),
    FIRIN_MORETT__UPLOAD_ADVANCE_PREPARATION_REBEL_PLANNERS_OR_DOCKING_BAY(true),
    FORCE_LEVITATION__UPLOAD_DEVICE(true),
    FOUND_SOMEONE_YOU_HAVE__RETRIEVE_TOPMOST_CHARACTER(true),
    FLY_CASUAL__UPLOAD_TYDIRIUM_OR_TANTIVE_IV(true),
    GEEZUM__UPLOAD_RELATED_SITE(true),
    GENERAL_CRIX_MADINE__UPLOAD_SCOUT(true),
    GENERAL_SOLO__PLAY_INTERRUPT_FROM_RESERVE_DECK(true),
    GENERAL_SOLO__UPLOAD_NON_INTERRUPT_CARD_WITH_DOOR_IN_GAME_TEXT(true),
    GET_TO_YOUR_SHIPS__DEPLOY_MATCHING_STARFIGHTER_OR_PILOT(true),
    GHOST__DOWNLOAD_PHANTOM(true),
    GIFT_OF_THE_MENTOR__UPLOAD_LIGHTSABER(true),
    GREAT_SHOT_KID__DOWNLOAD_STARSHIP_FROM_HAND_OR_RESERVE_DECK(true),
    GREEATA__UPLOAD_RODIAN(true),
    HANS_BACK__RETRIEVE_HAN(true),
    HANS_BACK__UPLOAD_HAN(true),
    HERAT__UPLOAD_UTINNI_OR_JAWA(true),
    HERMI_ODLE__DOWNLOAD_NON_UNIQUE_BLASTER_AS_REACT(true),
    HERO_OF_A_THOUSAND_DEVICES__UPLOAD_DEVICE(true),
    HIDDEN_BASE__DOWNLOAD_SYSTEM(true),
    HIDDEN_COMPARTMENT__DOWNLOAD_CHARACTER_WEAPON_AS_REACT(true),
    HOLOPROJECTOR__UPLOAD_HOLOGRAM_OR_DEJARIK(true),
    HOLONET_TRANSMISSION__UPLOAD_IMPERIAL_OR_VISAGE_OF_THE_EMPEROR_FROM_USED_PILE(true),
    HOPPING_MAD__UPLOAD_CARD(true),
    HUNCHBACK__SEARCH_FORCE_PILE(true),
    I_AM_YOUR_FATHER__DOWNLOAD_VADERS_LIGHTSABER(true),
    I_CANT_SHAKE_HIM__DOWNLOAD_IMPERIAL_ABOARD_YOUR_STARSHIP(true),
    I_CANT_SHAKE_HIM__DOWNLOAD_STARSHIP_WEAPON_OR_TRACTOR_BEAM(true),
    I_DONT_NEED_THEIR_SCUM_EITHER__UPLOAD_WE_DONT_NEED_THEIR_SCUM(true),
    I_KNOW__DOWNLOAD_LEIA_AND_OR_MATCHING_WEAPON_AS_REACT(true),
    I_MUST_BE_ALLOWED_TO_SPEAK__UPLOAD_CARD_FROM_USED_PILE(true),
    I_NEED_A_PILOT__DOWNLOAD_RESISTANCE_PILOT_OR_FINN_ABOARD_YOUR_STARSHIP(true),
    I_SHALL_ENJOY_WATCHING_YOU_DIE__DOWNLOAD_SARLACC_RANCOR_OR_RANCOR_PIT(true),
    I_WILL_FIND_THEM_QUICKLY_MASTER__DOWNLOAD_AMIDALA(true),
    I_WILL_MAKE_IT_LEGAL__UPLOAD_POLITICAL_EFFECT(true),
    I_WONDER_WHO_THEY_FOUND__UPLOAD_THATS_ONE_COUNT_ME_IN_OR_IM_WITH_YOU_TOO(true),
    IF_THE_TRACE_WAS_CORRECT__DOWNLOAD_SITH_PROBE_DROID(true),
    IG_88__UPLOAD_CARD_FROM_FORCE_PILE(true),
    ILCO_MUNICA__UPLOAD_NON_UNIQUE_RESISTANCE_CHARACTER(true),
    IM_GETTING_KIND_OF_GOOD_AT_THIS__DOWNLOAD_FINN(true),
    IMPERIAL_ARREST_ORDER__DOWNLOAD_DOCKING_BAY(true),
    IMPERIAL_ARREST_ORDER_SECRET_PLANS__DOWNLOAD_DOCKING_BAY(true),
    IMPERIAL_COMMAND__UPLOAD_ADMIRAL_OR_GENERAL(true),
    IMPERIAL_ENTANGLEMENTS__DOWNLOAD_TATOOINE_BATTLEGROUND_SITE(true),
    IMPERIAL_DOMINATION__RETRIEVE_IMPERIAL(true),
    IMPERIAL_OCCUPATION__DOWNLOAD_SITE(true),
    IN_THE_HANDS_OF_THE_EMPIRE__UPLOAD_CARD(true),
    INDEPENDENT_OPERATION__DOWNLOAD_DOCKING_BAY(true),
    INSURRECTION__DOWNLOAD_DOCKING_BAY(true),
    INSURRECTION_AIM_HIGH__DOWNLOAD_DOCKING_BAY(true),
    INTERROGATION_ARRAY__UPLOAD_TORTURE_OR_AIII_AAA_AGGGGGGGGGG(true),
    INVASION__DOWNLOAD_NABOO_SITE(true),
    ITS_A_HIT__UPLOAD_STARFIGHTER_FROM_LOST_PILE(true),
    ITS_AN_OLDER_CODE__DOWNLOAD_RELATED_SITES(true),
    IVE_GOT_A_BAD_FEELING_ABOUT__UPLOAD_SECURITY_DROID(true),
    JABBA_THE_HUTT__DOWNLOAD_SCUM_AND_VILLAINY(true),
    JABBAS_HAVEN__DOWNLOAD_NAL_HUTTA(true),
    JABBAS_PALACE__DOWNLOAD_JABBAS_PALACE_SITE(true),
    JABBAS_SAIL_BARGE__DOWNLOAD_PASSENGER_DECK(true),
    JABBAS_SAIL_BARGE__DOWNLOAD_PASSENGER_DECK_OR_SKIFF(true),
    JABBAS_THROUGH_WITH_YOU__DOWNLOAD_CHARACTER_WEAPON(true),
    JABBAS_TWERPS__DOWNLOAD_NON_UNIQUE_ALIENS(true),
    JAKKU_LANDING_SITE__DOWNLOAD_JAKKU_BATTLEGROUND(true),
    JAKKU_STARSHIP_GRAVEYARD__RETRIEVE_DEVICE_DROID_OR_WEAPON(true),
    JANGO_FETT__UPLOAD_BOBA_FETT(true),
    JEDI_COUNCIL_CHAMBER__DOWNLOAD_YODA(true),
    JEDI_LEVITATION__RETRIEVE_NON_MAINTENANCE_CHARACTER(true),
    JEDI_LEVITATION__UPLOAD_CARD_FROM_USED_PILE(true),
    JEDI_TEST__EXCHANGE_JEDI_TEST_IN_LOST_PILE(true),
    KASHYYYK_OPERATIVE__DOWNLOAD_SITE_TO_KASHYYYK(true),
    KEEPING_THE_EMPIRE_OUT_FOREVER__UPLOAD_CARD_FROM_FORCE_PILE(true),
    KESSEL_OPERATIVE__DOWNLOAD_SITE_TO_KESSEL(true),
    KIFFEX_OPERATIVE__DOWNLOAD_SITE_TO_KIFFEX(true),
    KIR_KANOS__UPLOAD_REBEL_GUARD(true),
    KIRDO_III__UPLOAD_DESERT_KITONAK_OR_SANDWHIRL(true),
    KIRDO_III_OPERATIVE__DOWNLOAD_SITE_TO_KIRDO_III(true),
    KINTAN_STRIDER__RETRIEVE_TOPMOST_CHARACTER(true),
    KRAYT_DRAGON_BONES__DEPLOY_OR_DOWNLOAD_CREATURE(true),
    KUAT_DRIVE_YARDS__DOWNLOAD_BATTLEGROUND_SYSTEM(true),
    KUAT_DRIVE_YARDS__UPLOAD_IMPERIAL_CLASS_STAR_DESTROYER(true),
    KYLO_RENS_COMMAND_SHUTTLE__DOWNLOAD_KYLO(true),
    MAJOR_PALO_TORSHAN__UPLOAD_DOUBLE_AGENT_OR_SABOTAGE(true),
    MASTERFUL_MOVE__UPLOAD_HOLOGRAM_DEJARIK_OR_IMPERIAL_HOLOTABLE(true),
    MOFF_JERJERROD__UPLOAD_DEATH_STAR_II_SECTOR_OR_SUPERLASER_MARK_II(true),
    LANDO_CALRISSIAN__UPLOAD_CHARACTER_WITH_CLOUD_CITY_IN_LORE(true),
    LAUDICA__DOWNLOAD_NON_UNIQUE_BLASTER_AS_REACT(true),
    LEIAS_BACK__RETRIEVE_LEIA(true),
    LEIAS_BACK__UPLOAD_LEIA(true),
    LEVITATION__UPLOAD_DROID_DEVICE_OR_STONE_PILE_FROM_USED_PILE(true),
    LEVITATION_ATTACK__SEARCH_FOR_DEVICE(true),
    LIEUTENANT_CECIUS__UPLOAD_BESIEGED_OR_SET_FOR_STUN(true),
    LIEUTENANT_SHECKIL__UPLOAD_HUMAN_SHIELD(true),
    LIEUTENANT_STOO_VEES__DOWNLOAD_STARSHIP_WEAPON(true),
    LIEUTENANT_SUBA__UPLOAD_TACTICAL_SUPPORT(true),
    LIFE_DEBT__DOWNLOAD_CHEWIE_AS_REACT(true),
    LIFE_DEBT__UPLOAD_FALCON(true),
    LIKE_MY_FATHER_BEFORE_ME__DOWNLOAD_LUKES_LIGHTSABER(true),
    LOBOT__DOWNLOAD_ALIEN_AS_REACT(true),
    LOBOT__DOWNLOAD_CYBORG_CONSTRUCT(true),
    LOCAL_DEFENSE__UPLOAD_CLOUD_CAR_OR_INDEPENDENT_STARSHIP(true),
    LOCAL_UPRISING__DOWNLOAD_SITE(true),
    LONE_ROGUE__UPLOAD_T47(true),
    LOTT_DOD__UPLOAD_CARD_FROM_FORCE_PILE(true),
    LUKES_BIONIC_HAND__EXCHANGE_CARD_IN_HAND_WITH_INTERRUPT_IN_LOST_PILE(true),
    LUKE_SKYWALKER_V__UPLOAD_DARKLIGHTER_SPIN(true),
    LUKES_BACK__RETRIEVE_LUKE(true),
    LUKES_BACK__UPLOAD_LUKE(true),
    MANDALORIAN_MISHAP__UPLOAD_CARD(true),
    MANEUVERING_FLAPS__DEPLOY_MATCHING_COMBAT_VEHICLE_OR_PILOT(true),
    MASSASSI_BASE_OPERATIONS__DOWNLOAD_YAVIN_4_SITE(true),
    MASSASSI_BASE_OPERATIONS__DOWNLOAD_YAVIN_4_SITE_OR_REBEL_TECH(true),
    MASTER_DESTROYERS__UPLOAD_NON_UNIQUE_DESTROYER_DROIDS(true),
    MASTER_QUIGON__UPLOAD_INTERRUPT_OR_STACK_CARD_ON_CREDITS_WILL_DO_FINE(true),
    MAUL_STRIKES__UPLOAD_LIGHTSABER(true),
    MIGHT_OF_THE_REPUBLIC__UPLOAD_SENATOR_CORUSCANT_GUARD_SEI_TARIA_OR_MAS_AMEDDA(true),
    MIND_WHAT_YOUR_HAVE_LEARNED__DOWNLOAD_CARD_TO_DAGOBAH(true),
    MINDFUL_OF_THE_FUTURE__DOWNLOAD_UNIQUE_BATTLEGROUND(true),
    MOISTURE_FARMER__UPLOAD_HYDROPONICS_STATION_OR_VAPORATOR(true),
    MON_MOTHMA__DOWNLOAD_REBEL(true),
    MURTTOC_YINE__UPLOAD_ALIEN_SMUGGLER_INFORMATION_BROKER_THIEF_OR_SPY(true),
    MY_FAVORITE_DECORATION__DOWNLOAD_SCUM_AND_VILLAINY(true),
    MY_LOYAL_BODYGUARD__DOWNLOAD_HANDMAIDEN(true),
    NAL_HUTTA__UPLOAD_BOUNTY_OR_HUTT_BOUNTY(true),
    NAL_HUTTA_OPERATIVE__DOWNLOAD_SITE_TO_NAL_HUTTA(true),
    NAR_SHADDA_WIND_CHIMES__UPLOAD_NON_UNIQUE_ALIEN(true),
    NEIMOIDIAN_ADVISOR__DOWNLOAD_UNIQUE_BATTLEGROUND(true),
    NUTE_GUNRAY_NEIMOIDIAN_VICEROY__UPLOAD_TAKE_THEM_AWAY(true),
    OBIWAN_KENOBI_PADAWAN_LEARNER__UPLOAD_NON_CHARACTER_CARD(true),
    OLD_ALLIES__DOWNLOAD_JAKKU_LOCATION(true),
    ONE_IN_A_MILLION__UPLOAD_CARD(true),
    OPERATIONAL_AS_PLANNED__DOWNLOAD_KRENNIC_OR_JEDHA_LOCATION(true),
    ORD_MANTELL_OPERATIVE__DOWNLOAD_SITE_TO_ORD_MANTELL(true),
    ORGANIZED_ATTACK__UPLOAD_NON_UNIQUE_XWINGS_AND_YWINGS(true),
    OUT_OF_SOMEWHERE__DEPLOY_CHARACTER_AS_REACT(true),
    OVERSEER__DOWNLOAD_RELATED_LOCATION(true),
    PAPLOO__UPLOAD_FREE_RIDE(true),
    PODRACER_COLLISION__SEARCH_OPPONENT_RESERVE_DECK(true),
    PORTABLE_SCANNER__UPLOAD_DEVICE_OR_WEAPON(true),
    POWER_OF_THE_HUTT__DOWNLOAD_CARD(true),
    PREPARE_FOR_A_SURFACE_ATTACK__DOWNLOAD_ATAT_OR_STAR_DESTROYER(true),
    PREPARE_FOR_A_SURFACE_ATTACK__UPLOAD_CARD(true),
    PROBE_TELEMETRY__SEARCH_LOST_PILE(true),
    PRINCESS_LEIA__DOWNLOAD_LEIA_OF_ALDERAAN_OR_REFLECTION(true),
    PRINCESS_ORGANA__DOWNLOAD_LEIA_OF_ALDERAAN_REFLECTION_OR_LEADER(true),
    PUCUMIR_THRYSS__DOWNLOAD_NON_UNIQUE_REBEL(true),
    QUICK_DRAW__DOWNLOAD_BLASTER_FROM_LOST_PILE(true),
    QUICK_REFLEXES__UPLOAD_HIDDEN_WEAPONS_OR_DOWNLOAD_BLASTER_FROM_LOST_PILE(true),
    QUIET_MINING_COLONY__DOWNLOAD_SITE_OR_CLOUD_SECTOR(true),
    REACTOR_CORE__DOWNLOAD_THAT_THINGS_OPERATIONAL(true),
    RAITHAL_OPERATIVE__DOWNLOAD_SITE_TO_RAITHAL(true),
    RALLTIIR_OPERATIONS__DOWNLOAD_SITE_OR_NONUNIQUE_IMPERIAL_TO_RALLTIIR(true),
    RALLTIIR_OPERATIVE__DOWNLOAD_SITE_TO_RALLTIIR(true),
    RAPID_DEPLOYMENT__DOWNLOAD_TROOPERS(true),
    RAPID_FIRE__DOWNLOAD_WEAPON_FROM_RESERVE_DECK(true),
    RAYNO_VACA__UPLOAD_LANA_DOBREED(true),
    REBEL_LEADERSHIP__UPLOAD_ADMIRAL_OR_GENERAL(true),
    REBEL_STRIKE_TEAM__UPLOAD_BUNKER_OR_DEACTIVATE_THE_SHIELD_GENERATOR(true),
    REBEL_TECH__UPLOAD_DEATH_STAR_TRENCH(true),
    RED_1__UPLOAD_RED_SQUADRON_XWING(true),
    REDEMPTION__DOWNLOAD_REBEL_FROM_LOST_PILE(true),
    REEGESK__TAKE_CARD_FROM_OPPONENTS_LOST_PILE_OR_CRASH_SITE_MEMORIAL(true),
    RETURN_OF_A_JEDI__RETRIEVE_OBIWAN(true),
    RETURN_OF_A_JEDI__UPLOAD_OBIWAN(true),
    REY__UPLOAD_CARD_FROM_USED_PILE(true),
    ROCHE__DOWNLOAD_BIG_ONE_OR_ASTEROID_CAVE(true),
    ROLLING_ROLLING_ROLLING__UPLOAD_NON_UNIQUE_DESTROYER_DROID(true),
    SAITORR_KAL_FAS__DOWNLOAD_MATCHING_WEAPON(true),
    SABE__DOWNLOAD_AMIDALA(true),
    SANITY_AND_COMPASSION__UPLOAD_POLITICAL_EFFECT(true),
    SCRAMBLED_TRANSMISSION__UPLOAD_SHOCKING_INFORMATION(true),
    SECRET_PLANS__UPLOAD_SHOCKING_REVELATION(true),
    SECURITY_CONTROL__DOWNLOAD_DOCKING_BAY(true),
    SECURITY_TOWER__UPLOAD_DESPAIR(true),
    SEEKING_AN_AUDIENCE__DOWNLOAD_CARD(true),
    SEEKING_AN_AUDIENCE__DOWNLOAD_NON_REFLECTIONS_III_CARD(true),
    SERGEANT_HOLLIS__UPLOAD_REBEL_AMBUSH(true),
    SET_YOUR_COURSE_FOR_ALDERAAN__UPLOAD_CARD_WITH_DEATH_STAR_IN_TITLE(true),
    SHORT_RANGE_FIGHTERS__UPLOAD_NON_UNIQUE_STARFIGHTER(true),
    SHORT_RANGE_FIGHTERS__UPLOAD_UNIQUE_STARFIGHTER(true),
    SIZE_MATTERS_NOT__UPLOAD_CARD(true),
    SLAYN_AND_KORPIL_FACILITIES__DOWNLOAD_STARSHIP_WEAPON(true),
    SKULL__PLACE_CARD_OUT_OF_PLAY_FROM_LOST_PILE(true),
    SKULL__UPLOAD_FALLEN_PORTAL_OR_BLAST_THE_DOOR_KID(true),
    SNOOVA__DOWNLOAD_VIBRO_AX(true),
    SONIC_BOMBARDMENT__UPLOAD_PRISON(true),
    SONIC_BOMBARDMENT__UPLOAD_DOWNTOWN_PLAZA_OR_PRISON(true),
    SONIC_BOMBARDMENT__UPLOAD_UNIQUE_BOUNTY(true),
    SOTH_PETIKKIN__UPLOAD_ALIEN(true),
    SOUND_THE_ATTACK__UPLOAD_VEHICLE_WEAPON_OR_INTERRUPT_WITH_EWOK_IN_TITLE(true),
    SPEAK_WITH_THE_JEDI_COUNCIL__DOWNLOAD_JEDI_COUNCIL_CHAMBER(true),
    SPEAK_WITH_THE_JEDI_COUNCIL__DOWNLOAD_JEDI_COUNCIL_MEMBER(true),
    SQUABBLING_DELEGATES__UPLOAD_SENATOR_OR_CORUSCANT_GUARD(true),
    SQUADRON_ASSIGNMENTS__DEPLOY_MATCHING_STARFIGHTER_OR_PILOT(true),
    SSA719__SEARCH_OPPONENT_RESERVE_DECK(true),
    STARKILLER_BASE__DOWNLOAD_STARKILLER_BASE_BATTLEGROUND(true),
    STARSHIP_LEVITATION__RETRIEVE_NON_MAINTENANCE_STARSHIP(true),
    STARSHIP_LEVITATION__UPLOAD_STARSHIP_FROM_USED_PILE(true),
    START_THE_EVACUATION__UPLOAD_CARD(true),
    STOLEN_DATA_TAPES__UPLOAD_CARD(true),
    SURFACE_DEFENSE__DOWNLOAD_EFFECT(true),
    SWAMP__DOWNLOAD_CREATURE(true),
    TACTICAL_SUPPORT__UPLOAD_TROOPERS(true),
    TAKE_THIS__UPLOAD_PROTON_TORPEDOES_OR_BRAVO_FIGHTER(true),
    TARKINS_BOUNTY__UPLOAD_CARD_FROM_FORCE_PILE(true),
    TARKINS_ORDERS__UPLOAD_STARFIGHTER_FROM_LOST_PILE(true),
    TAUNTAUN_SKULL__PLACE_CARD_OUT_OF_PLAY_FROM_LOST_PILE(true),
    TAUNTAUN_SKULL__UPLOAD_STOP_MOTION_OR_YAGGLE_GAKKLE(true),
    THE_EMPIRES_BACK__RETRIEVE_VADER_TARKIN_MOTTI_OR_TAGGE(true),
    THE_EMPIRES_BACK__UPLOAD_VADER_TARKIN_MOTTI_OR_TAGGE(true),
    THE_PHANTOM_MENACE__DOWNLOAD_NEIMOIDIAN(true),
    THE_REBELS_ARE_THERE__UPLOAD_HOTH_CARD_OR_DAGOBAH_IMPERIAL(true),
    THE_SHIELD_IS_DOWN__DOWNLOAD_BACK_DOOR(true),
    THE_SHIELD_IS_DOWN__DOWNLOAD_ENDOR_BATTLEGROUND_SITE(true),
    THE_SIGNAL__UPLOAD_EFFECT(true),
    THE_ULTIMATE_POWER_IN_THE_UNIVERSE__DOWNLOAD_BATTLEGROUND_SYSTEM(true),
    THERE_THEY_ARE__UPLOAD_NON_UNIQUE_BATTLE_DROID_OR_DROID_STARFIGHTER(true),
    THEYRE_TRACKING_US__DOWNLOAD_RELATED_SYSTEM(true),
    THIS_DEAL_IS_GETTING_WORSE_ALL_THE_TIME__UPLOAD_CARD(true),
    THIS_PLACE_CAN_BE_A_LITTLE_ROUGH__PLAY_INTERRUPT_FROM_LOST_PILE(true),
    THIS_IS_MY_SHIP__DEPLOY_GHOST_AND_HERA(true),
    THIS_IS_STILL_WRONG__UPLOAD_THIS_IS_JUST_WRONG(true),
    THROW_ME_ANOTHER_CHARGE__UPLOAD_AUTOMATED_WEAPON(true),
    TIBRIN_OPERATIVE__DOWNLOAD_SITE_TO_TIBRIN(true),
    TIE_SENTRY_SHIPS__RETRIEVE_STARSHIP(true),
    TORYN_FARR__RESCUE_REBEL(true),
    TRADE_FEDERATION_LANDING_CRAFT__UPLOAD_MTT(true),
    TT6__DOWNLOAD_BATTLE_DROID_LEADER(true),
    TT9__DOWNLOAD_STAP(true),
    TUNNEL_VISION__UPLOAD_CARD_FROM_FORCE_PILE(true),
    TWILEK_ADVISOR__UPLOAD_EFFECT(true),
    TWILIGHT_IS_UPON_ME__UPLOAD_THE_FORCE_IS_STRONG_WITH_THIS_ONE_OR_ANAKIN_SKYWALKER(true),
    TWIN_SUNS_OF_TATOOINE__DOWNLOAD_TATOOINE_BATTLEGROUND_SITE(true),
    TYCHO_CELCHU__STEAL_TIE_FROM_LOST_PILE(true),
    UGNAUGHT__UPLOAD_WEAPON_OR_DEVICE_FROM_LOST_PILE(true),
    UNDERCOVER__DOWNLOAD_WELL_GUARDED(true),
    UNDERCOVER__DOWNLOAD_YARNA_DAL_GARGAN(true),
    UNEXPECTED_INTERRUPTION__UPLOAD_INTERRUPT(true),
    UUTKIK__STEAL_FROM_LOST_PILE(true),
    VIZAM__UPLOAD_VEHICLE_WEAPON(true),
    WALKER_GARRISON__UPLOAD_ATAT(true),
    WALKER_SIGHTING__DOWNLOAD_SITES(true),
    WARRANT_OFFICER_MKEA__UPLOAD_TRACTOR_BEAM_OUR_FIRST_CATCH_OF_THE_DAY_OR_BESIEGED(true),
    WATCH_YOUR_STEP__UPLOAD_CORELLIA_OR_KESSEL(true),
    WATTO__UPLOAD_WATTOS_CHANCE_CUBE(true),
    WE_CAN_STILL_OUTMANEUVER_THEM__UPLOAD_COLLISION_OR_EGREGIOUS_PILOT_ERROR(true),
    WE_MUST_ACCELERATE_OUR_PLANS__DOWNLOAD_BLOCKADE_FLAGSHIP_SITE(true),
    WE_MUST_ACCELERATE_OUR_PLANS__UPLOAD_EFFECT(true),
    WE_MUST_ACCELERATE_OUR_PLANS__UPLOAD_INTERRUPT(true),
    WE_WISH_TO_BOARD_AT_ONCE__UPLOAD_EFFECT(true),
    WE_WISH_TO_BOARD_AT_ONCE__UPLOAD_RADIANT_VII_OR_INTERRUPT(true),
    WEAPON_LEVITATION__UPLOAD_WEAPON_FROM_USED_PILE(true),
    WEAPONS_DISPLAY__DOWNLOAD_WEAPON_FROM_LOST_PILE(true),
    WEDGE_ANTILLES__UPLOAD_CORELLIAN_SLIP(true),
    WELL_EARNED_COMMAND__UPLOAD_IMPERIAL_PROPAGANDA(true),
    WERE_LEAVING__RETRIEVE_STARSHIP_INTO_HAND(true),
    WERE_LEAVING__UPLOAD_STARSHIP(true),
    WERE_YOU_LOOKING_FOR_ME__RETRIEVE_C3PO(true),
    WERE_YOU_LOOKING_FOR_ME__UPLOAD_DROIDS(true),
    WESA_GOTTA_GRAND_ARMY__UPLOAD_FAMBAA_BATTLE_PLAINS_OR_BOSS_NASS_CHAMBERS(true),
    WHOOOO__UPLOAD_UNIQUE_N1_STARFIGHTER(true),
    WHY_DOES_EVERYONE_WANT_TO_GO_BACK_TO_JAKKU__DOWNLOAD_LOR_SAN_TEKKA(true),
    WHY_DOES_EVERYONE_WANT_TO_GO_BACK_TO_JAKKU__UPLOAD_RESISTANCE_CHARACTER(true),
    WIORKETTLE__UPLOAD_SITE(true),
    WOOKIEE_ROAR__UPLOAD_CHEWIE(true),
    WUTA__DOWNLOAD_ENDOR_SITE(true),
    XIZORS_PALACE__DOWNLOAD_XIZORS_PALACE_SITE(true),
    YARNA_DAL_GARGAN__DOWNLOAD_CARD(true),
    YAVIN_4_BASE_OPERATIONS__DOWNLOAD_BATTLEGROUND_SYSTEM(true),
    YODA_YOU_SEEK_YODA__RETRIEVE_YODA(true),
    YODA_YOU_SEEK_YODA__UPLOAD_YODA(true),
    YODAS_HOPE__UPLOAD_LEVITATION_CARD(true),
    YOU_ARE_BEATEN__UPLOAD_I_AM_YOUR_FATHER(true),
    YOU_CANNOT_HIDE_FOREVER__UPLOAD_EFFECT(true),
    YOU_CANNOT_HIDE_FOREVER_MOBILIZATION_POINTS__UPLOAD_EFFECT(true),
    YOU_KNOW_WHAT_IVE_COME_FOR__UPLOAD_FIRST_ORDER_SHUTTLE(true),
    YOU_SWINDLED_ME__UPLOAD_CARD_FROM_USED_PILE(true),
    YOU_TRULY_BELONG_HERE_WITH_US__UPLOAD_INTERRUPT(true),
    YOU_WILL_TAKE_ME_TO_JABBA_NOW__DOWNLOAD_ALIEN(true),
    YOUR_INSIGHT_SERVES_YOU_WELL__UPLOAD_EFFECT(true),
    YOUR_INSIGHT_SERVES_YOU_WELL_STAGING_AREAS__UPLOAD_EFFECT(true),
    YOXGIT__UPLOAD_WEAPON_OR_DEVICE_FROM_LOST_PILE(true),
    YUB_YUB__RETRIEVE_CARD_WITH_EWOK_IN_TITLE(true),
    YUZZUM__UPLOAD_WE_HAVE_A_PRISONER(true),
    ZAM_WESELL__UPLOAD_CARD_FROM_FORCE_PILE(true),

    // Per game
    _3B310__UPLOAD_HALT(true, true),
    A_MILLION_VOICES_CRYING_OUT__UPLOAD_CPI(true, true),
    A_TRAGEDY_HAS_OCCURRED__STACK_INTERRUPT(false, true),
    ABYSSIN_ORNAMENT__RETRIEVE_FORCE(false, true),
    ADMIRAL_ACKBAR__UPLOAD_ADMIRALS_ORDER_OR_CHARACTER(true, true),
    ADMIRAL_MOTTI__DOWNLOAD_KUAT_DRIVE_YARDS(true, true),
    ADMIRAL_PIETT__UPLOAD_ADMIRALS_ORDER_OR_COMMANDER(true, true),
    ADMIRAL_RADDUS__UPLOAD_CARD(true, true),
    ALL_WINGS_REPORT_IN__RETRIEVE_FORCE(false, true),
    ALLEGATIONS_OF_CORRUPTION__STACK_INTERRUPT(false, true),
    ALLIANCE_ASSEMBLED__UPLOAD_HAVEN(true, true),
    AMBUSH__ADD_TO_FORCE_DRAINS(false, true),
    AN_UNUSUAL_AMOUNT_OF_FEAR__PLAY_DEFENSIVE_SHIELD(false, true),
    ANAKINS_PODRACER__UPLOAD_I_DID_IT(true, true),
    ANGER_FEAR_AGGRESSION__PLAY_CARD(false, true),
    ARICA__RELOCATE_TO_LUKES_LOCATION(false, true),
    AUDIENCE_CHAMBER__DOWNLOAD_ALIEN(true, true),
    BATTLE_PLAINS__UPLOAD_GUNGAN_ENERGY_SHIELD(true, true),
    BELDONS_EYE__DEPLOY_STARFIGHTER_AND_MATCHING_PILOT(true, true),
    BLACK_6__RETRIEVE_BOTTOM_CARD_OF_LOST_PILE(true, true),
    BLOCKADE_FLAGSHIP__DOWNLOAD_NEIMOIDIAN(true, true),
    BOBA_FETT__EXCHANGE_CARD_WITH_CARD_IN_RESERVE_DECK(false, true),
    BOBA_FETTS_BLASTER_RIFLE__RELOCATE_BOBA_FETT(false, true),
    BOONTA_EVE_PODRACE__INITIATE_PODRACE(false, true),
    BOOSTER_IN_PULSAR_SKATE__DOWNLOAD_MIRAX(true, true),
    BOSS_NASS_CHAMBERS__UPLOAD_BOSS_NASS(true, true),
    BOW_TO_THE_FIRST_ORDER__UPLOAD_FINALIZER(true, true),
    BRISKY_MORNING_MUNCHEN__DOWNLOAD_JAR_JAR(true, true),
    BUNKER__DOWNLOAD_ENDOR_SHIELD(true, true),
    CAPTAIN_CASSIAN_ANDOR__CANCEL_WEAPON_OR_BATTLE_DESTINY(true, true),
    CAPTAIN_DAULTAY_DOFINE__UPLOAD_ACTIVATE_THE_DROIDS(true, true),
    CAPTAIN_PANAKA__DOWNLOAD_BLASTER(true, true),
    CHIRRUT_IMWE__RECIRCULATE(false, true),
    CITY_OUTSKIRTS__DOWNLOAD_JEDI(true, true),
    COMMANDER_NEMET__DOWNLOAD_IMPERIAL_CLASS_STAR_DESTROYER(true, true),
    CORPORAL_DELEVAR__DOWNLOAD_21B(true, true),
    CORUSCANT_IMPERIAL_CITY__DOWNLOAD_CHARACTER(true, true),
    COUNT_DOOKU__UPLOAD_FORCE_LIGHTNING_OR_FORCE_PUSH(true, true),
    DONT_DO_THAT_AGAIN__UPLOAD_IMMEDIATE_EFFECT(true, true),
    ELIS_IN_HINTHRA__DOWNLOAD_SMUGGLER(true, true),
    ENDOR_SHIELD__UPLOAD_IMPERIAL_ADMIRAL(true, true),
    ENTERING_THE_AREA__UPLOAD_PODRACER_BAY(true, true),
    ESTABLISH_CONTROL__DOWNLOAD_CORULAG_OR_FONDOR(true, true),
    FANFARE__UPLOAD_IMMEDIATE_EFFECT(true, true),
    FEAR_IS_MY_ALLY__PLAY_DEFENSIVE_SHIELD(false, true),
    FINN__UPLOAD_BLASTER_PROFICIENCY(true, true),
    FORCE_PUSH__EXCLUDE_CHARACTERS_OR_EXCHANGE_CARDS(false, true),
    GENERAL_JAR_JAR__UPLOAD_BRISKY_MORNING_MUNCHEN(true, true),
    GENERAL_GRIEVOUS__STEAL_LIGHTSABER_FROM_LOST_PILE(true, true),
    GENERAL_HUX__UPLOAD_STRATEGIC_RESERVES_OR_FIRST_ORDER_STORMTROOPER(true, true),
    GENERAL_KENOBI__UPLOAD_CLONE_OR_REF_III_LIGHTSABER(true, true),
    HARC_SEFF__UPLOAD_IMMEDIATE_EFFECT(true, true),
    HONDO_OHNAKA__DOWNLOAD_AURRA_SING_SLAVE_I_OR_KOWAKIAN(true, true),
    HOTH_ICE_PLAINS__EXCHANGE_INTERRUPT_IN_HAND_WITH_BOTTOM_CARD_OF_RESERVE_DECK(false, true),
    I_DID_IT__RETRIEVE_FORCE(false, true),
    I_MUST_BE_ALLOWED_TO_SPEAK__DOWNLOAD_FARM(true, true),
    I_WILL_FIND_THEM_QUICKLY_MASTER__UPLOAD_IF_THE_TRACE_WAS_CORRECT(true, true),
    I_WILL_FINISH_WHAT_YOU_STARTED__DOWNLOAD_LIGHTSABER(true, true),
    IM_SORRY__UPLOAD_BATTLEGROUNDS(true, true),
    IMPRESSIVE_MOST_IMPRESSIVE__TAKE_FIRST_WEAPONS_SEGMENT_ACTION(false, true),
    JABBAS_HAVEN__RETRIEVE_CARD_INTO_HAND(false, true),
    JABBAS_TWERPS__RETRIEVE_FORCE(false, true),
    KETWOL__EXCHANGE_DOCKING_BAY(true, true),
    KIR_KANOS__CANCEL_INTERRUPT(false, true),
    KNOWLEDGE_AND_DEFENSE__PLAY_CARD(false, true),
    LAUNCHING_THE_ASSAULT__UPLOAD_HOME_ONE(true, true),
    LEIA_REBEL_PRINCESS__CANCEL_FORCE_DRAIN(false, true),
    LESLOMY_TACEMA__DOWNLOAD_CARD_WITH_ELLORRS_IN_TITLE(true, true),
    LIEUTENANT_CHAMBERLYN__DOWNLOAD_BLASTER(true, true),
    LT_KAYDEL_CONNIX__UPLOAD_CARD(true, true),
    LORD_SIDIOUS__UPLOAD_ALWAYS_TWO_THERE_ARE_OR_NEIMOIDIAN(true, true),
    MAAREK_STELE_THE_EMPERORS_REACH__UPLOAD_TIE_DEFENDER(true, true),
    MAJOR_BREN_DERLIN__RETRIEVE_EXPLOSIVE_CHARGE_INTO_HAND(false, true),
    MAJOR_TURR_PHENNIR__UPLOAD_FIGHTERS_COMING_IN(true, true),
    MARA_JADE_THE_EMPERORS_HAND__DOWNLOAD_WEAPON(true, true),
    MIGHT_OF_THE_REPUBLIC__RETRIEVE_FORCE(false, true),
    MOBILIZATION_POINTS__UPLOAD_SYSTEM_OR_EXECUTOR(true, true),
    MYN_KYNEUGH__PLACE_INTERRUPT_OUT_OF_PLAY(false, true),
    NAR_SHADDAA__UPLOAD_HANS_TOOLKIT(true, true),
    NAR_SHADDAA_WIND_CHIMES__RETRIEVE_FORCE(false, true),
    NI_CHUBA_NA__DOWNLOAD_SEBULBA(true, true),
    OBIWAN_KENOBI__EXCHANGE_CARDS_WITH_CARD_IN_LOST_PILE(false, true),
    ONE_IN_A_MILLION__UPLOAD_ATTACK_RUN_OR_PROTON_TORPEDOES(true, true),
    OOM9__UPLOAD_OPEN_FIRE_OR_CEASE_FIRE(true, true),
    OR_BE_DESTROYED__RETRIEVE_FORCE(false, true),
    OVERSEEING_IT_PERSONALLY__PLACE_OUT_OF_PLAY_TO_RETRIEVE_VADER(true, true),
    PADME_NABERRIE__DOWNLOAD_QUIGON_OR_OBIWAN(true, true),
    POTE_SNITKIN__RECYCLE_TRANSPORT_VEHICLE(false, true),
    PRISONER_2187__FOR_REMAINDER_OF_GAME_CHANGES(false, true),
    PROPHECY_OF_THE_FORCE__RETRIEVE_CARD_WITH_ANAKIN_INTO_HAND(false, true),
    QUIGON_JINN_JEDI_MASTER__DOWNLOAD_LIGHTSABER_FROM_LOST_PILE(true, true),
    REBEL_FLIGHT_SUIT__CANCEL_INTERRUPT(false, true),
    REBELLIONS_ARE_BUILT_ON_HOPE__UPLOAD_DANTOOINE_MON_CALAMARI_YAVIN_4_OR_PROFUNDITY(true, true),
    REP_BEEN__UPLOAD_UNDERWATER_SITE(true, true),
    REYS_ENCAMPMENT__DOWNLOAD_REY(true, true),
    RKIK_DNEC_HERO_OF_THE_DUNE_SEA__DOWNLOAD_JAWA_ION_GUN(true, true),
    RTIC_HWEEL__UPLOAD_JAWA_BLASTER_OR_CARD_WITH_SANDCRAWLER_IN_TITLE_OR_GAMETEXT(true, true),
    SAVAGE_OPRESS__EXCHANGE_CARD_IN_HAND_WITH_SITH_IN_LOST_PILE(false, true),
    SCIMITAR_2__DOWNLOAD_PROTON_BOMBS(true, true),
    SECRET_PRECAUTIONS__RESTORE_STARSHIP_TO_NORMAL(false, true),
    SECURITY_TOWER__UPLOAD_LANDO(true, true),
    SEE_THREEPIO__RETRIEVE_FORCE(false, true),
    SENATOR_MON_MOTHMA__DOWNLOAD_CHANDRILA(true, true),
    SHMI_SKYWALKER__UPLOAD_TATOOINE_THREEPIO(true, true),
    SHORT_RANGE_FIGHTERS__RETRIEVE_FORCE(false, true),
    SITH_FURY__DOWNLOAD_DARK_JEDI(true, true),
    SLAVE_QUARTERS__DOWNLOAD_SHMI(true, true),
    SOLO__PLAY_INTERRUPT_FROM_LOST_PILE(true, true),
    SOMETHING_SPECIAL_PLANNED_FOR_THEM__STACK_INTERRUPT(false, true),
    SON_OF_SKYWALKER__DOWNLOAD_LIGHTSABER(true, true),
    SQUABBLING_DELEGATES__RETRIEVE_FORCE(false, true),
    STRIKE_PLANNING__UPLOAD_MON_MOTHMA_OR_GENERAL(true, true),
    STRIKEFORCE__STACK_INTERRUPT(false, true),
    TAMTEL_SKREEJ__DOWNLOAD_UNDERCOVER(true, true),
    TEMMIN_SNAP_WEXLEY__STEAL_BATTLE_DROID_INTO_HAND(false, true),
    THE_FALCON__MAKE_ADDITIONAL_MOVE(false, true),
    THE_GARBAGE_WILL_DO__ADD_TO_TOTAL_POWER_OR_TAKE_CARD_FROM_GRAVEYARD_OF_GIANTS(false, true),
    THE_HYPERDRIVE_GENERATORS_GONE__UPLOAD_CORUSCANT_AND_OR_TATOOINE(true, true),
    THEED_PALACE_HALLWAY__DOWNLOAD_BATTLE_DROID(true, true),
    THEED_PALACE_HALLWAY__UPLOAD_ASCENSION_GUNS(true, true),
    THEED_PALACE_HALLWAY__UPLOAD_SET_1_ASCENSION_GUNS(true, true),
    THEY_MUST_NEVER_AGAIN_LEAVE_THIS_CITY__EXECUTOR_DEPLOYS_FOR_FREE(false, true),
    THRONE_ROOM__UPLOAD_EMPERORS_POWER(true, true),
    VEERS__UPLOAD_PREPARE_FOR_A_SURFACE_ATTACK_HOTH_COMBAT_VEHICLE_OR_EXTERIOR_MARKER_SITE(true, true),
    VIGO__DOWNLOAD_LOCATION(true, true),
    WATTOS_JUNKYARD__DOWNLOAD_WATTO(true, true),
    WELL_TAKE_THE_LONG_WAY__UPLOAD_SYSTEM_AND_OR_LEADER(true, true),
    WELL_TRAINED_IN_THE_JEDI_ARTS__DOWNLOAD_TATOOINE_OCCUPATION(true, true),
    WERE_LEAVING__STACK_CARD_FROM_LOST_PILE_ON_CREDITS(false, true),
    WOKLING__UPLOAD_EFFECT(true, true),
    XIZORS_PALACE_SEWER__DOWNLOAD_BLACK_SUN_AGENT_FROM_LOST_PILE(true, true),
    XIZORS_PALACE_SEWER__DOWNLOAD_DASH_FROM_LOST_PILE(true, true),
    YAVIN_4_MASSASSI_WAR_ROOM__DOWNLOAD_REBEL_LEADER(true, true),
    YODA_MASTER_OF_THE_FORCE__UPLOAD_SENSE_CONTROL_OR_ALTER(true, true),
    YOTTS_ORREN__UPLOAD_MECHANICAL_FAILURE_AND_OR_FREE_RIDE(true, true),
    YOU_ARE_IN_COMMAND_NOW__DOWNLOAD_REBEL_BASE_OCCUPATION(true, true),
    YOU_MAY_START_YOUR_LANDING__UPLOAD_WALKER_GARRISON_AND_3RD_MARKER(true, true),
    YOU_TRULY_BELONG_HERE_WITH_US__DOWNLOAD_CLOUD_CITY_CELEBRATION(true, true),

    // Per captive
    DUNGEON__RETRIEVE_FORCE(false, false, true, false),
    SPECIAL_DELIVERY__SEARCH_LOST_PILE(true, false, true, false),

    // Per Force drain
    IMPERIAL_ATROCITY__DEPLOY_ON_LOCATION(false, false, false, true),
    IMPERIAL_PROPAGANDA__DEPLOY_ON_LOCATION(false, false, false, true),

    // Per race total
    SEBULBAS_PODRACER__OPPONENT_DRAWS_NO_RACE_DESTINY(false, false, false, false, true),

    // Per turn for card title
    SUPPRESSIVE_FIRE__ACTIVATE_FORCE(false, false, false, false, false, true),

    // Actions that are for specified reasons
    OUT_OF_COMMISSION__PLACE_CARD_OUT_OF_PLAY(false, false, false, false, false, false, PlayCardActionReason.ATTEMPTING_TO_PLACE_A_CARD_OUT_OF_PLAY),

    // Special action done for deploying cards (per game)
    DEPLOY_CARD_ACTION(false, true);

    private boolean _searchCardPile;
    private boolean _perGame;
    private boolean _perCaptive;
    private boolean _perForceDrain;
    private boolean _perRaceTotal;
    private boolean _perTurnForCardTitle;
    private PlayCardActionReason _actionReason;

    /**
     * Creates an identifier for a card action.
     */
    GameTextActionId() {
        this(false, false, false, false);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     */
    GameTextActionId(boolean searchCardPile) {
        this(searchCardPile, false, false, false);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     * @param perGame true if action is "... per game", otherwise false
     */
    GameTextActionId(boolean searchCardPile, boolean perGame) {
        this(searchCardPile, perGame, false, false);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     * @param perGame true if action is "... per game", otherwise false
     * @param perCaptive true if action is "... per captive", otherwise false
     * @param perForceDrain true if action is "... per Force drain", otherwise false
     */
    GameTextActionId(boolean searchCardPile, boolean perGame, boolean perCaptive, boolean perForceDrain) {
        this(searchCardPile, perGame, perCaptive, perForceDrain, false);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     * @param perGame true if action is "... per game", otherwise false
     * @param perCaptive true if action is "... per captive", otherwise false
     * @param perForceDrain true if action is "... per Force drain", otherwise false
     * @param perRaceTotal true if action is "... per race total", otherwise false
     */
    GameTextActionId(boolean searchCardPile, boolean perGame, boolean perCaptive, boolean perForceDrain, boolean perRaceTotal) {
        this(searchCardPile, perGame, perCaptive, perForceDrain, perRaceTotal, false);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     * @param perGame true if action is "... per game", otherwise false
     * @param perCaptive true if action is "... per captive", otherwise false
     * @param perForceDrain true if action is "... per Force drain", otherwise false
     * @param perRaceTotal true if action is "... per race total", otherwise false
     * @param perTurnForCardTitle true if action is "... per turn" for card title, otherwise false
     */
    GameTextActionId(boolean searchCardPile, boolean perGame, boolean perCaptive, boolean perForceDrain, boolean perRaceTotal, boolean perTurnForCardTitle) {
        this(searchCardPile, perGame, perCaptive, perForceDrain, perRaceTotal, perTurnForCardTitle, null);
    }

    /**
     * Creates an identifier for a card action.
     * @param searchCardPile true if action searches a card pile, otherwise false
     * @param perGame true if action is "... per game", otherwise false
     * @param perCaptive true if action is "... per captive", otherwise false
     * @param perForceDrain true if action is "... per Force drain", otherwise false
     * @param perRaceTotal true if action is "... per race total", otherwise false
     * @param perTurnForCardTitle true if action is "... per turn" for card title, otherwise false
     * @param actionReason the action reason, or null
     */
    GameTextActionId(boolean searchCardPile, boolean perGame, boolean perCaptive, boolean perForceDrain, boolean perRaceTotal, boolean perTurnForCardTitle, PlayCardActionReason actionReason) {
        _searchCardPile = searchCardPile;
        _perGame = perGame;
        _perCaptive = perCaptive;
        _perForceDrain = perForceDrain;
        _perRaceTotal = perRaceTotal;
        _perTurnForCardTitle = perTurnForCardTitle;
        _actionReason = actionReason;
    }

    /**
     * Determines if action searches a card pile.
     * @return true or false
     */
    public boolean isSearchCardPile() {
        return _searchCardPile;
    }

    /**
     * Determines if action is "... per game".
     * @return true or false
     */
    public boolean isPerGame() {
        return _perGame;
    }

    /**
     * Determines if action is "... per captive".
     * @return true or false
     */
    public boolean isPerCaptive() {
        return _perCaptive;
    }

    /**
     * Determines if action is "... per Force drain".
     * @return true or false
     */
    public boolean isPerForceDrain() {
        return _perForceDrain;
    }

    /**
     * Determines if action is "... per turn" for card title.
     * @return true or false
     */
    public boolean isPerTurnForCardTitle() {
        return _perTurnForCardTitle;
    }

    /**
     * Determines if action is "... per race total".
     * @return true or false
     */
    public boolean isPerRaceTotal() {
        return _perRaceTotal;
    }

    /**
     * Determines if action is for the specified action reason.
     * @return true or false
     */
    public boolean isForActionReason(PlayCardActionReason actionReason) {
        return _actionReason != null && actionReason == _actionReason;
    }
}

