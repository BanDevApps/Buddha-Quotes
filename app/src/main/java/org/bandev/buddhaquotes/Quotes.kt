@file:Suppress(
    "SpellCheckingInspection", "SpellCheckingInspection", "SpellCheckingInspection",
    "SpellCheckingInspection", "SpellCheckingInspection", "SpellCheckingInspection",
    "SpellCheckingInspection", "SpellCheckingInspection", "SpellCheckingInspection",
    "SpellCheckingInspection", "SpellCheckingInspection", "SpellCheckingInspection",
    "SpellCheckingInspection", "SpellCheckingInspection"
)

package org.bandev.buddhaquotes

class Quotes {
    var quotenumberglobal: Int = 0
    private var maxQuote = 311
    fun random(Quote_Number: Int): String {
        val num: Int = if (Quote_Number == 0) {
            getRandomIntegerBetweenRange(0.0, maxQuote.toDouble()).toInt()
        } else {
            Quote_Number
        }
        var text = ""
        when (num) {
            1 -> text = "Everything changes, nothing remains without change"
            2 -> text =
                "Everything is changeable, everything appears and disappears there is no blissful peace until one passes beyond the agony of life and death"
            3 -> text =
                "Let yourself be open and life will be easier. A spoon of salt in a glass of water makes the water undrinkable. A spoon of salt in a lake is almost unnoticed"
            4 -> text = "All that we are is the result of what we have thought"
            5 -> text =
                "Anger will never disappear so long as thoughts of resentment are cherished in the mind. Anger will disappear just as soon as thoughts of resentment are forgotten"
            6 -> text = "Neither fire nor wind, birth nor death can erase our good deeds"
            7 -> text =
                "No one saves us but ourselves. No one can and no one may. We ourselves must walk the path"
            8 -> text =
                "A man is not called wise because he talks and talks again; but if he is peaceful, loving and fearless then he is in truth called wise"
            9 -> text =
                "There is no fire like passion, there is no shark like hatred, there is no snare like folly, there is no torrent like greed"
            10 -> text =
                "Feelings come and go like clouds in a windy sky. Conscious breathing is my anchor"
            11 -> text =
                "Just as a snake sheds its skin, we must shed our past over and over again"
            12 -> text = "True love is born from understanding"
            13 -> text =
                "Long is the night to him who is awake; long is a mile to him who is tired; long is life to the foolish who do not know the true law"
            14 -> text =
                "You are the community now. Be a lamp for yourselves. Be your own refuge. Seek for no other. All things must pass. Strive on diligently. Don’t give up"
            15 -> text =
                "It is a man's own mind, not his enemy or foe, that lures him to evil ways"
            16 -> text = "The Way is not in the sky; the Way is in the heart"
            17 -> text =
                "There is nothing so disobedient as an undisciplined mind, and there is nothing so obedient as a disciplined mind"
            18 -> text =
                "Know well what leads you forward and what holds you back, and choose the path that leads to wisdom"
            19 -> text = "Three things cannot be long hidden: the sun, the moon, and the truth"
            20 -> text =
                "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment"
            21 -> text = "What we think, we become"
            22 -> text = "I never see what has been done; I only see what remains to be done"
            23 -> text =
                "However many holy words you read, however many you speak, what good will they do you if you do not act on upon them?"
            24 -> text =
                "To live a pure unselfish life, one must count nothing as one's own in the midst of abundance"
            25 -> text = "Those who are free of resentful thoughts surely find peace"
            26 -> text = "Work out your own salvation. Do not depend on others"
            27 -> text =
                "Do not overrate what you have received, nor envy others. He who envies others does not obtain peace of mind"
            28 -> text =
                "To be idle is a short road to death and to be diligent is a way of life; foolish people are idle, wise people are diligent"
            29 -> text =
                "Whatever words we utter should be chosen with care for people will hear them and be influenced by them for good or ill"
            30 -> text =
                "Without health life is not life; it is only a state of langour and suffering - an image of death"
            31 -> text = "Virtue is persecuted more by the wicked than it is loved by the good"
            32 -> text =
                "I do not believe in a fate that falls on men however they act; but I do believe in a fate that falls on them unless they act"
            33 -> text =
                "We are what we think. All that we are arises with our thoughts. With our thoughts, we make the world"
            34 -> text =
                "There are only two mistakes one can make along the road to truth; not going all the way, and not starting"
            35 -> text =
                "Health is the greatest gift, contentment the greatest wealth, faithfulness the best relationship"
            36 -> text = "Peace comes from within. Do not seek it without"
            37 -> text = "Chaos is inherent in all compounded things. Strive on with diligence"
            38 -> text = "A jug fills drop by drop"
            39 -> text = "Even death is not to be feared by one who has lived wisely"
            40 -> text =
                "You, yourself, as much as anybody in the entire universe, deserve your love and affection"
            41 -> text =
                "All wrong-doing arises because of mind. If mind is transformed can wrong-doing remain?"
            42 -> text = "Better than a thousand hollow words, is one word that brings peace"
            43 -> text =
                "Just as a candle cannot burn without fire, men cannot live without a spiritual life"
            44 -> text = "It is better to travel well than to arrive"
            45 -> text =
                "Hatred does not cease by hatred, but only by love; this is the eternal rule"
            46 -> text = "The mind is everything. What you think you become"
            47 -> text =
                "To keep the body in good health is a duty... otherwise we shall not be able to keep our mind strong and clear"
            48 -> text =
                "In a controversy the instant we feel anger we have already ceased striving for the truth, and have begun striving for ourselves"
            49 -> text =
                "It is better to conquer yourself than to win a thousand battles. Then the victory is yours. It cannot be taken from you, not by angels or by demons, heaven or hell"
            50 -> text = "Better than worshiping gods is obedience to the laws of righteousness"
            51 -> text =
                "He who walks in the eightfold noble path with unswerving determination is sure to reach Nirvana"
            52 -> text =
                "With fools, there is no companionship. Rather than to live with men who are selfish, vain, quarrelsome, and obstinate, let a man walk alone"
            53 -> text = "Radiate boundless love towards the entire world"
            54 -> text = "A disciplined mind brings happiness"
            55 -> text = "Give, even if you only have a little"
            56 -> text =
                "Conquer anger with non-anger. Conquer badness with goodness. Conquer meanness with generosity. Conquer dishonesty with truth"
            57 -> text =
                "Those who cling to perceptions and views wander the world offending people"
            58 -> text =
                "Drop by drop is the water pot filled. Likewise, the wise man, gathering it little by little, fills himself with good"
            59 -> text =
                "I will not look at another’s bowl intent on finding fault: a training to be observed"
            60 -> text =
                "Let none find fault with others; let none see the omissions and commissions of others. But let one see one’s own acts, done and undone"
            61 -> text =
                "Should a person do good, let him do it again and again. Let him find pleasure therein, for blissful is the accumulation of good"
            62 -> text = "May all beings have happy minds"
            63 -> text = "Delight in heedfulness! Guard well your thoughts!"
            64 -> text =
                "Should you find a wise critic to point out your faults, follow him as you would a guide to hidden treasure"
            65 -> text =
                "Should a seeker not find a companion who is better or equal, let them resolutely pursue a solitary course"
            66 -> text = "In whom there is no sympathy for living beings: know him as an outcast"
            67 -> text =
                "Hatred is never appeased by hatred in this world. By non-hatred alone is hatred appeased. This is a law eternal"
            68 -> text = "Live with no sense of ‘mine,’ not forming attachment to experiences"
            69 -> text =
                "Better it is to live one day seeing the rise and fall of things than to live a hundred years without ever seeing the rise and fall of things"
            70 -> text =
                "One is not called noble who harms living beings. By not harming living beings one is called noble"
            71 -> text =
                "If a man going down into a river, swollen and swiftly flowing, is carried away by the current — how can he help others across?"
            72 -> text =
                "All conditioned things are impermanent - when one sees this with wisdom, one turns away from suffering"
            73 -> text = "Ardently do today what must be done. Who knows? Tomorrow, death comes"
            74 -> text =
                "The world is afflicted by death and decay. But the wise do not grieve, having realised the nature of the world"
            75 -> text = "Resolutely train yourself to attain peace"
            76 -> text =
                "To support mother and father, to cherish wife and children, and to be engaged in peaceful occupation — this is the greatest blessing"
            77 -> text =
                "All tremble at violence; all fear death. Putting oneself in the place of another, one should not kill nor cause another to kill"
            78 -> text =
                "They blame those who remain silent, they blame those who speak much, they blame those who speak in moderation. There is none in the world who is not blamed"
            79 -> text =
                "Just as the great ocean has one taste, the taste of salt, so also this teaching and discipline has one taste, the taste of liberation"
            80 -> text =
                "If with a pure mind a person speaks or acts, happiness follows them like a never-departing shadow"
            81 -> text =
                "As an elephant in the battlefield withstands arrows shot from bows all around, even so shall I endure abuse"
            82 -> text =
                "The one in whom no longer exist the craving and thirst that perpetuate becoming; how could you track that Awakened one, trackless, and of limitless range"
            83 -> text = "The root of suffering is attachment"
            84 -> text =
                "Whatever precious jewel there is in the heavenly worlds, there is nothing comparable to one who is Awakened"
            85 -> text =
                "As a water bead on a lotus leaf, as water on a red lily, does not adhere, so the sage does not adhere to the seen, the heard, or the sensed"
            86 -> text =
                "It is in the nature of things that joy arises in a person free from remorse"
            87 -> text =
                "All experiences are preceded by mind, having mind as their master, created by mind"
            88 -> text =
                "Ceasing to do evil, Cultivating the good, Purifying the heart: This is the teaching of the Buddhas"
            89 -> text = "Understanding is the heartwood of well-spoken words"
            90 -> text =
                "As I am, so are these. As are these, so am I. Drawing the parallel to yourself, neither kill nor get others to kill"
            91 -> text =
                "Just as a solid rock is not shaken by the storm, even so the wise are not affected by praise or blame"
            92 -> text =
                "We will develop love, we will practice it, we will make it both a way and a basis…"
            93 -> text = "There is no fear for one whose mind is not filled with desires"
            94 -> text =
                "Whatever is not yours: let go of it. Your letting go of it will be for your long-term happiness & benefit"
            95 -> text = "Meditate … do not delay, lest you later regret it"
            96 -> text = "Whatever has the nature of arising has the nature of ceasing"
            97 -> text =
                "Know from the rivers in clefts and in crevices: those in small channels flow noisily, the great flow silent. Whatever’s not full makes noise. Whatever is full is quiet"
            98 -> text =
                "If you knew what I know about the power of giving, you would not let a single meal pass without sharing it in some way"
            99 -> text =
                "Let him not deceive another nor despise anyone anywhere. In anger or ill will let him not wish another ill"
            100 -> text =
                "Your own self is your master; who else could be? With yourself well controlled, you gain a master very hard to find"
            101 -> text =
                "Conquer anger through gentleness, unkindness through kindness, greed through generosity, and falsehood by truth"
            102 -> text =
                "Like someone pointing to treasure is the wise person who sees your faults and points them out. Associate with such a sage"
            103 -> text =
                "Your work is to discover your work and then with all your heart to give yourself to it"
            104 -> text =
                "I do not dispute with the world; rather it is the world that disputes with me"
            105 -> text = "You cannot travel the path until you have become the path itself"
            106 -> text =
                "If we could see the miracle of a single flower clearly, our whole life would change"
            107 -> text = "The only real failure in life is not to be true to the best one knows"
            108 -> text =
                "The whole secret of existence is to have no fear. Never fear what will become of you, depend on no one. Only the moment you reject all help are you freed"
            109 -> text =
                "Some do not understand that we must die, But those who do realise this settle their quarrels"
            110 -> text =
                "With realisation of one's own potential and self-confidence, one can build a better world"
            111 -> text =
                "Do not give your attention to what others do or fail to do; give it to what you do or fail to do"
            112 -> text =
                "When we feel love and kindness toward others, it not only makes others feel loved and cared for, but it helps us also to develop inner happiness and peace"
            113 -> text =
                "By living deeply in the present moment, we can understand the past better and we can prepare for a better future"
            114 -> text = "If anything is worth doing, do it with all your heart"
            115 -> text = "He is able who thinks he is able"
            116 -> text = "Be kind whenever possible. It is always possible"
            117 -> text =
                "Calm mind brings inner strength and self-confidence, so that's very important for good health"
            118 -> text =
                "To refrain from evil and from strong drink and to be always steadfast in virtue; this is the good luck"
            119 -> text =
                "In the sky, there is no distinction of east and west; people create distinctions out of their own minds and then believe them to be true"
            120 -> text =
                "Endurance is one of the most difficult disciplines, but it is to the one who endures that the final victory comes"
            121 -> text =
                "Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy"
            122 -> text =
                "Teach this triple truth to all: A generous heart, kind speech, and a life of service an compassion are the things that renew humanity"
            123 -> text =
                "Anger or hatred is like a fisherman's hook. It is very important for us to ensure that we are not caught by it"
            124 -> text =
                "All suffering is caused by ignorance. People inflict pain on others in the selfish pursuit of their own happiness or satisfaction"
            125 -> text =
                "We are shaped by our thoughts; we become what we think. When the mind is pure, joy follows like a shadow that never leaves"
            126 -> text =
                "He who experiences the unity of life sees his own self in all beings, and all beings in his own self, and looks on everything with an impartial eye"
            127 -> text =
                "When you practice gratefulness, there is a sense of respect toward others"
            128 -> text = "Be a lamp unto yourself. Work out your liberation with liberation"
            129 -> text =
                "A dog is not considered a good dog because he is a good barker. A man is not considered a good man because he is a good talker"
            130 -> text =
                "Follow then the shining ones, the wise, the awakened, the loving, for they know how to work and forbear"
            131 -> text =
                "It is very important to generate a good attitude, a good heart, as much as possible. From this, happiness in both the short term and the long term for both yourself and others will come"
            132 -> text = "Choose to be optimistic, it feels better"
            133 -> text =
                "All things appear and disappear because of the concurrence of cause and conditions. Nothing ever exists entirely alone; everything is in relation to everything else"
            134 -> text = "Attention is the rarest and purest form of generosity"
            135 -> text = "Life is available only in the present moment"
            136 -> text =
                "Be what you are. This is the first step toward becoming better than you are"
            137 -> text =
                "If you want others to be happy, practice compassion. If you want to be happy, practice compassion"
            138 -> text = "Anger is the ultimate destroyer of your own peace of mind"
            139 -> text =
                "People have a hard time letting go of their suffering. Out of a fear of the unknown, they prefer suffering that is familiar"
            140 -> text =
                "An insincere and evil friend is more to be feared than a wild beast; a wild beast may wound your body, but an evil friend will wound your mind"
            141 -> text =
                "Even if things don't unfold the way you expected, don't be disheartened or give up. One who continues to advance will win in the end"
            142 -> text =
                "Letting go gives us freedom, and freedom is the only condition for happiness. If, in our heart, we still clint to anything - anger, anxiety, or possessions - we cannot be free"
            143 -> text = "Look at situations from all angles, and you will become more open"
            144 -> text =
                "To be beautiful means to be yourself. You don't need to be accepted by others. You need to accept yourself"
            145 -> text =
                "A person, who no matter how desperate the situation, gives others hope, is a true leader"
            146 -> text = "He is not the same, nor is he another"
            147 -> text = "My actions are my only true belongings"
            148 -> text =
                "Little by little a person becomes evil, as a water pot is filled by drops of water; Little by little a person becomes good, as a water pot is filled by drops of water"
            149 -> text =
                "Real generosity is doing something nice for someone who will never find out"
            150 -> text = "A family is a place where minds come in contact with one another"
            151 -> text =
                "The more you are motivated by Love, The more Fearless and Free your action will be"
            152 -> text = "Silence is sometimes the best answer"
            153 -> text =
                "Because we all share an identical need for love, it is possible to feel that anybody we meet, in whatever circumstances, is a brother or sister"
            154 -> text =
                "The wise ones fashioned speech with their thought, sifting it as a grain is sifted through a sieve"
            155 -> text =
                "Those who really seek the path to Enlightenment dictate terms to their mind. Then they proceed with strong determination"
            156 -> text =
                "As irrigators lead water where they want, as archers make their arrows straight, as carpenters carve wood, the wise shape their minds"
            157 -> text =
                "It is necessary to combine knowledge born from study with sincere practice in our daily lives. These two must go together"
            158 -> text = "It is not enough to be compassionate, we must act"
            159 -> text =
                "Love and compassion are necessities, not luxuries. Without them, humanity cannot survive"
            160 -> text = "An open heart is an open mind"
            161 -> text =
                "People take different roads seeking fulfillment and happiness. Just because they're not on your road doesn't mean they've gotten lost"
            162 -> text = "Because you are alive, everything is possible"
            163 -> text = "To understand everything is to forgive everything"
            164 -> text =
                "Happiness mainly comes from our own attitude, rather than from external factors"
            165 -> text =
                "Silence the angry man with love. Silence the ill-natured man with kindness. Silence the miser with generosity. Silence the liar with truth"
            166 -> text =
                "Believe nothing, no matter where you read it, or who said it, no matter if I have said it, unless it agrees with you own reason and common sense"
            167 -> text =
                "Like a lovely flower full of colour but lacking in fragrance, are the words of those who do not practice what they teach"
            168 -> text =
                "Think not lightly of evil, saying 'It will not come to me.' Drop by drop is the water pot filled. Likewise the fool, gathering it little by little, fills himself with evil"
            169 -> text =
                "If you find no one to support you on the spiritual path, walk alone There is no companionship with the immature"
            170 -> text =
                "He insulted me, he cheated me, he beat me, he robbed me -- those who are free of resentful thoughts surely find peace"
            171 -> text = "Love is the absence of judgement"
            172 -> text =
                "A good friend who points out mistakes and imperfections and rebukes evil is to be respected as if he reveals a secret of hidden treasure"
            173 -> text = "Purity or impurity depend on oneself; no one can purify another"
            174 -> text =
                "Dharma is not upheld by talking about it. Dharma is upheld by living in harmony with it..."
            175 -> text =
                "See them, floundering in their sense of mind, like fish in the puddles of a dried-up stream - and, seeing this, live with no mine, not forming attachment for states of becoming"
            176 -> text =
                "A mind unruffled by the vagaries of fortune, from sorrow freed, from defilements cleansed, from fear liberated - this is the greatest blessing"
            177 -> text = "The greatest prayer is patience"
            178 -> text =
                "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them"
            179 -> text = "Do not think of how big the universe is, it will merely hurt your head"
            180 -> text = "Ambition is like love, impatient both of delays and rivals"
            181 -> text =
                "In order to carry a positive action, we must develop here a positive vision"
            182 -> text =
                "Leave behind the passive dreaming of a rose-tinted future. The energy of happiness exists in living today with roots sunk firmly in reality's soil"
            183 -> text =
                "If you love someone but rarely make yourself available to them, that is not true love"
            184 -> text = "True change is within, leave the outside as it is"
            185 -> text = "Our own life has to be our message"
            186 -> text =
                "Have compassion for all beings, rich and poor alike; each has their suffering. Some suffer too much, others too little"
            187 -> text = "The roots of all goodness lie in the soil of appreciation for goodness"
            188 -> text = "The way to change others' minds is with affection, and not anger"
            189 -> text =
                "A truly compassionate attitude toward others does not change even if they behave negatively or hurt you"
            190 -> text = "We are here to awaken from our illusion of separateness"
            191 -> text =
                "A great human revolution in just a single individual will help achieve a change in the destiny of a nation and, further, can even enable a change in the destiny of all humankind"
            192 -> text =
                "Peace does not mean an absence of conflicts; differences will always be there. Peace means solving these differences through peaceful means; through dialogue, education, knowledge; and through humane ways"
            193 -> text =
                "Times of luxury do not last long, but pass away very quickly nothing in this world can be long enjoyed"
            194 -> text =
                "Times of luxury do not last long, but pass away very quickly nothing in this world can be long enjoyed"
            195 -> text =
                "He who can curb his wrath as soon as it arises, as a timely antidote will check snake's venom that so quickly spreads - such a monk gives up the here and the beyond, just as a serpent sheds its worn-out skin"
            196 -> text =
                "If you can cultivate the right attitude, your enemies are your best spiritual teachers because their presence provides you with the opportunity to enhance and develop your tolerance, patience and understanding"
            197 -> text =
                "It is easy to see the faults of others, but difficult to see one's own faults. One shows the faults of other like chaff winnowed in the wind, but one conceals one's own faults as a cunning gambler conceals his dice"
            198 -> text =
                "The source of love is deep in us and we can help others realise a lot of happiness. One word, one action, one thought can reduce another person's suffering and bring that person joy"
            199 -> text =
                "When one has the feeling of dislike for evil, when one feels tranquil, one finds pleasure in listening to good teachings; when one has these feelings and appreciates them, one is free of fear"
            200 -> text = "The darkest night is ignorance"
            201 -> text =
                "One moment can change a day, one day can change a life and one life can change the world"
            202 -> text =
                "Greater in battle than the man who would conquer a thousand-thousand men, is he who would conquer just one – himself. Better to conquer yourself than others"
            203 -> text =
                "Thousands of candles can be lit from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared"
            204 -> text =
                "Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one who gets burned"
            205 -> text =
                "Pure-limbed, white-canopied, one-wheeled, the cart roles on. See him that cometh: faultless, stream-cutter, bondless he"
            206 -> text = "Be vigilant; guard your mind against negative thoughts"
            207 -> text = "May all that have life be delivered from suffering"
            208 -> text =
                "As you walk and eat and travel, be where you are. Otherwise, you will miss most of your life"
            209 -> text =
                "When the Aggregates arise, decay and die, O bhikkhu, every moment you are born, decay, and die"
            210 -> text =
                "To insist on a spiritual practice that served you in the past is to carry the raft on your back after you have crossed the river"
            211 -> text =
                "Analysing through special insight and realising the lack of inherent existence constitute understanding of the signless"
            212 -> text =
                "Even as a solid rock is unshaken by the wind, so are the wise unshaken by praise or blame"
            213 -> text = "Remembering a wrong is like carrying a burden on the mind"
            214 -> text =
                "Imagine that every person in the world is enlightened but you. They are all your teachers, each doing just the right things to help you learn perfect patience, perfect wisdom, perfect compassion"
            215 -> text =
                "For the good of the many, for the happiness of the many, out of compassion for the world"
            216 -> text =
                "If the selflessness of phenomena is analysed and if this analysis is cultivated, it causes the effect of attaining nirvana. Through no other cause does one come to peace"
            217 -> text =
                "How blissful it is, for one who has nothing. Attainers-of-wisdom are people with nothing. See him suffering, one who has something, a person bound in mind with people"
            218 -> text =
                "This I tell you: decay is inherent in all conditioned things. Work out your own salvation, with diligence"
            219 -> text = "Life is a river always flowing. Do not hold onto things. Work hard"
            220 -> text = "The wise man makes an island of himself that no flood can overwhelm"
            221 -> text =
                "Our theories of the eternal are as valuable as are those that a chick which has not broken its way through its shell might form of the outside world"
            222 -> text =
                "Victory breeds hatred. The defeated live in pain. Happily the peaceful live, giving up victory and defeat"
            223 -> text =
                "There isn’t enough darkness in all the world to snuff out the light of one little candle"
            224 -> text = "Contentment is the greatest wealth"
            225 -> text =
                "Just to say ‘I believe’ or ‘I do not doubt’ does not mean that you understand and see. To force oneself to see and accept a thing without understanding is political and not spiritual or intellectual"
            226 -> text =
                "Every experience, no matter how bad it seems, holds within it a blessing of some kind. The goal is to find it"
            227 -> text =
                "Let us rise up and be thankful, for if we didn’t learn a lot at least we learned a little, and if we didn’t learn a little, at least we didn’t get sick, and if we got sick, at least we didn’t die; so, let us all be thankful"
            228 -> text = "Friendship is the only cure for hatred, the only guarantee of peace"
            229 -> text = "Happiness comes when your work and words are of benefit to others"
            230 -> text =
                "The one who has conquered himself is a far greater hero than he who has defeated a thousand times a thousand men"
            231 -> text =
                "He has no need for faith who knows the uncreated, who has cut off rebirth, who has destroyed any opportunity for good or evil, and cast away all desire. He is indeed the ultimate man"
            232 -> text = "Be greatly aware of the present"
            233 -> text = "If you truly loved yourself, you could never hurt another"
            234 -> text =
                "He who experiences the unity of life sees his own Self in all beings, and all beings in his own Self, and looks on everything with an impartial eye"
            235 -> text =
                "What you think, you become. What you feel, you attract. What you imagine, you create"
            236 -> text =
                "As a flower that is lovely and beautiful, but is scentless, even so, fruitless is the well-spoken word of one who practices it not"
            237 -> text =
                "As a lotus flower is born in water, grows in water and rises out of water to stand above it unsoiled, so I, born in the world, raised in the world having overcome the world, live unsoiled by the world"
            238 -> text =
                "Those which are produced from causes are not produced. They do not have an inherent nature of production. Those which depend on causes are said to be empty; those who know emptiness are aware"
            239 -> text =
                "When you like a flower, you just pluck it. But when you love a flower, you water it daily"
            240 -> text = "Doubt everything. Find your own light"
            241 -> text = "You throw thorns, falling in my silence they become flowers"
            242 -> text = "The Gift of Truth excels all other Gifts"
            243 -> text =
                "As rain falls equally on the just and the unjust, do not burden your heart with judgments but rain your kindness equally on all"
            244 -> text =
                "Meditate, Ānanda, do not delay, or else you will regret it later. This is our instruction to you"
            245 -> text = "The foot feels the foot when it feels the ground"
            246 -> text = "If you light a lamp for somebody, it will also brighten your path"
            247 -> text =
                "To live in the consciousness of the inevitability of suffering, of becoming enfeebled, of old age and of death, is impossible – we must free ourselves from life, from all possible life"
            248 -> text =
                "Monks, even if bandits were to savagely sever you, limb by limb, with a double-handled saw, even then, whoever of you harbors ill will at heart would not be upholding my teaching"
            249 -> text = "The virtuous man delights in this world and he delights in the next"
            250 -> text = "Kindness should become the natural way of life, not the exception"
            251 -> text = "All descriptions of reality are temporary hypotheses"
            252 -> text =
                "Most problems, if you give them enough time and space, will eventually wear themselves out"
            253 -> text =
                "Awake. Be the witness of your thoughts. You are what observes, not what you observe"
            254 -> text =
                "If you are facing in the right direction, all you need to do is keep on walking"
            255 -> text = "To become vegetarian is to step into the stream which leads to nirvana"
            256 -> text = "The teaching is simple. Do what is right. Be pure"
            257 -> text = "Attachment leads to suffering"
            258 -> text =
                "Words have the power to both destroy and heal. When words are both true and kind, they can change our world"
            259 -> text =
                "What we are today comes from our thoughts of yesterday, and present thoughts build our life of tomorrow: our life is the creation of our own mind"
            260 -> text =
                "She who knows life flows, feels no wear or tear, needs no mending or repair"
            261 -> text =
                "The past is already gone, the future is not yet here. There’s only one moment for you to live, and that is the present moment"
            262 -> text =
                "Conquer the angry one by not getting angry; conquer the wicked by goodness; conquer the stingy by generosity, and the liar by speaking the truth"
            263 -> text =
                "If a traveler does not meet with one who is his better, or his equal, let him firmly keep to his solitary journey; there is no companionship with a fool"
            264 -> text = "Your actions are your only belongings"
            265 -> text = "If you do not change direction, you may end up where you are heading"
            266 -> text =
                "Speak the truth, do not become angered, and give when asked, even be it a little. By these three conditions, one goes to the presence of the gods"
            267 -> text = "There has to be evil so that good can prove its purity above it"
            268 -> text =
                "If you knew what I know about the power of giving, you would not let a single meal pass without sharing it in some way"
            269 -> text =
                "All phenomena do not inherently exist because of being dependent-arisings. All phenomena do not inherently exist because of being dependently imputed"
            270 -> text = "He who loves 50 people has 50 woes; he who loves no one has no woes"
            271 -> text = "From a withered tree, a flower blooms"
            272 -> text =
                "Opinion, O disciples, is a disease; opinion is a tumor; opinion is a sore. He who has overcome all opinion, O disciples, is called a saint, one who knows"
            273 -> text =
                "When you come upon a path that brings benefit and happiness to all, follow this course as the moon journeys through the stars"
            274 -> text =
                "There are no chains like hate… Dwelling on your brother’s faults multiplies your own. You are far from the end of your journey"
            275 -> text =
                "How wonderful! How wonderful! All things are perfect, exactly as they are"
            276 -> text =
                "It is a man’s own mind, not his enemy or foe, that leads him to evil ways"
            277 -> text =
                "Happiness does not depend on what you have or who you are, it solely relies on what you think"
            278 -> text =
                "Meditate. Live purely. Be quiet. Do your work with mastery. Like the moon, come out from behind the clouds! Shine"
            279 -> text = "There is no path to happiness: happiness is the path"
            280 -> text =
                "If we fail to look after others when they need help, who will look after us?"
            281 -> text =
                "Whoever sees me sees the teaching, and whoever sees the teaching sees me"
            282 -> text = "Wear your ego like a loose fitting garment"
            283 -> text =
                "In the end, only three things matter: how much you loved, how gently you lived, and how gracefully you let go of things not meant for you"
            284 -> text =
                "Few among men are they who cross to the further shore. The others merely run up and down the bank on this side"
            285 -> text = "Every human being is the author of his own health or disease"
            286 -> text = "Nothing can harm you as much as your own thoughts unguarded"
            287 -> text = "Every morning we are born again. What we do today is what matters most"
            288 -> text =
                "Praise and blame, gain and loss, pleasure and sorrow come and go like the wind. To be happy, rest like a giant tree in the midst of them all"
            289 -> text =
                "When you realise how perfect everything is, you will tilt your head back and laugh at the sky"
            290 -> text = "You only lose what you cling to"
            291 -> text = "What you are is what you have been. What you’ll be is what you do now"
            292 -> text =
                "Following the Noble Path is like entering a dark room with a light in the hand; the darkness will all be cleared away, and the room will be filled with light"
            293 -> text =
                "There is nothing more dreadful than the habit of doubt. Doubt separates people. It is a poison that disintegrates friendships and breaks up pleasant relations. It is a thorn that irritates and hurts; it is a sword that kills"
            294 -> text = "People with opinions just go around bothering one another"
            295 -> text = "Those which arise dependently are free of inherent existence"
            296 -> text =
                "In separateness lies the world’s greatest misery; in compassion lies the world’s true strength"
            297 -> text = "The ignorant man is an ox. He grows in size, not in wisdom"
            298 -> text =
                "Set your heart on doing good. Do it over and over again, and you will be filled with joy"
            299 -> text =
                "More than those who hate you, more than all your enemies, an undisciplined mind does greater harm"
            300 -> text = "Our life is shaped by our mind, for we become what we think"
            301 -> text =
                "Learn this from water: loud splashes the brook but the oceans depth are calm"
            302 -> text =
                "Though one should live a hundred years without wisdom and control, yet better, indeed, is a single day’s life of one who is wise and meditative"
            303 -> text = "Nothing is forever except change"
            304 -> text = "Success isn’t the key to happiness. Happiness is the key to success"
            305 -> text =
                "Whatever a monk keeps pursuing with his thinking and pondering, that becomes the inclination of his awareness"
            306 -> text =
                "If you propose to speak, always ask yourself, is it true, is it necessary, is it kind"
            307 -> text =
                "Those who have failed to work toward the truth have missed the purpose of living"
            308 -> text = "Rule your mind or it will rule you"
            309 -> text =
                "Meditation brings wisdom; lack of meditation leaves ignorance. Know well what leads you forward and what hold you back, and choose the path that leads to wisdom"
            310 -> text =
                "Many do not realise that we here must die. For those who realise this, quarrels end"
            311 -> text =
                "Perhaps the deepest reason why we are afraid of death is because we do not know who we are"
            312 -> text =
                "The non-doing of any evil, the performance of what's skillful, the cleansing of one's own mind: this is the teaching of the Awakened"
            313 -> text = "Is it timely? Is it necessary? Is it kind?"
            314 -> text =
                "Whatever an enemy might do to an enemy, or a foe to a foe, the ill-directed mind can do to you even worse"
            315 -> text =
                "Who leaves behind all human bonds And has cast off the bonds of heaven, Detached from all bonds everywhere: He is the one I call a brahmin"
            316 -> text =
                "The growth of wisdom may be measured exactly by the diminution of ill temper"
            317 -> text = "The trouble is, you think you have time"
            318 -> text = "Greater still is the truth of our connectedness"
            319 -> text = "Live every act fully, as if it were your last"
            320 -> text = "Above all, do not lose your desire to walk"
            321 -> text = "It is possible to live 24 hours in a state of love"
            322 -> text = "The universe itself is change and life itself is but what you deem it"
            323 -> text = "Patience is the highest asceticism"
            324 -> text =
                "The moment you see how important it is to love yourself, you will stop making others suffer"
            325 -> text =
                "Joy comes not through possession or ownership but through a wise and loving heart"
            326 -> text = "Ambition is like love, impatient of both delays and rivals"
            327 -> text =
                "I shall live here in the rains, There in winter, Elsewhere in summer,\" muses the fool, Not aware of the nearness of death"
            328 -> text =
                "Better it is to live alone; there is no fellowship with a fool. Live alone and do no evil; be carefree like an elephant in the elephant forest"
            329 -> text = "You don't gather the beauty of a flower by plucking her petals"
            330 -> text =
                "Tune as the sitthar, neither high nor low, and we will dance away the hearts of men"
            331 -> text =
                "In life we cannot avoid change, we cannot avoid loss. Freedom and happiness are found in the flexibility and ease with which we move through change"
            332 -> text =
                "Delightful are forests Where the public does not delight. There the passion-free delight, Not seeking sensual pleasure"
            333 -> text =
                "It’s your road… and yours alone… Others may walk it with you, but no one can walk it for you. No matter what path you choose, really walk it"
            334 -> text = "Emotion arise from Desire, hence an Illusion"
            335 -> text = "The less you have, the less you have to worry about"
            336 -> text =
                "The rain could turn to gold and still your thirst would not be slaked. Desire is unquenchable or it ends in tears, even in heaven"
            337 -> text = "Love yourself and watch --- today, tomorrow, and always"
            338 -> text =
                "Analysing through special insight and realising the lack of inherent existence constitute understanding of the signless"
            339 -> text =
                "A man asked Gautama Buddha, \"I want happiness.\" Buddha said, \"First remove \"I,\" that's Ego, then remove \"want,\" that's Desire. See now you are left with only \"Happiness\""
            340 -> text =
                "Virtuous people always let go. They don't prattle about pleasures and desires. Touched by happiness and then by suffering, The sage shows no sign of being elated or depressed"
            341 -> text =
                "Sensual craving gives rise to grief; Sensual craving gives rise to fear. For someone released from sensual craving There is no grief; And from where would be fear?"
        }
        quotenumberglobal = num
        return text
    }

    companion object {
        fun getRandomIntegerBetweenRange(min: Double, max: Double): Double {
            return (Math.random() * (max - min + 1)).toInt() + min
        }
    }
}