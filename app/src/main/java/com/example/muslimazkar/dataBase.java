package com.example.muslimazkar;

import java.util.ArrayList;
import java.util.Arrays;

public class dataBase {

    public static ArrayList<String> favorite = new ArrayList();


    public static ArrayList<groupAzkar> getazkarlist(){
        ArrayList<groupAzkar> azkarlist = new ArrayList();

            azkarlist.add(new groupAzkar("أذكار الصباح",
                    Arrays.asList("(أَصبَحْنا على فِطرةِ الإسلامِ، وعلى كَلِمةِ الإخلاصِ، وعلى دِينِ نَبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّمَ، وعلى مِلَّةِ أبِينا إبراهيمَ، حَنيفًا مُسلِمًا، وما كان مِنَ المُشرِكينَ)\n","(بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ). (ثلاثُ مراتٍ).\n"
                            ,"(سبحانَ اللَّهِ وبحمدِهِ مئةَ مرَّةٍ)."
                            ,"(اللَّهُمَّ أنْتَ رَبِّي لا إلَهَ إلَّا أنْتَ، خَلَقْتَنِي وأنا عَبْدُكَ، وأنا علَى عَهْدِكَ ووَعْدِكَ ما اسْتَطَعْتُ، أعُوذُ بكَ مِن شَرِّ ما صَنَعْتُ، أبُوءُ لكَ بنِعْمَتِكَ عَلَيَّ، وأَبُوءُ لكَ بذَنْبِي فاغْفِرْ لِي، فإنَّه لا يَغْفِرُ الذُّنُوبَ إلَّا أنْتَ)."
                            ,"(اللَّهمَّ بِكَ أصبَحنا، وبِكَ أمسَينا، وبِكَ نحيا وبِكَ نموتُ وإليكَ المصيرُ، وإذا أمسَى فليقُلْ: اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ النُّشورُ)."
                            ,"(اللهمَّ إني أسألُك العفوَ والعافيةَ، في الدنيا والآخرةِ، اللهمَّ إني أسألُك العفوَ والعافيةَ، في دِيني ودنيايَ وأهلي ومالي، اللهمَّ استُرْ عوراتي، وآمِنْ روعاتي، واحفظني من بين يدي، ومن خلفي، وعن يميني، وعن شمالي، ومن فوقي، وأعوذُ بك أن أُغْتَالَ من تحتي)."
                            ,"(اللهمَّ إنِّي أعوذُ بك من الهمِّ والحزنِ، والعجزِ والكسلِ، والبُخلِ والجُبنِ، وضَلَعِ الدَّينِ، وغَلَبَةِ الرجالِ)."
                            ,"(يا حيُّ يا قيُّومُ، برَحمتِكَ أستَغيثُ، أصلِح لي شأني كُلَّهُ، ولا تَكِلني إلى نَفسي طرفةَ عينٍ)."
                            ,"(اللَّهمَّ عالِمَ الغَيبِ والشَّهادةِ، فاطرَ السَّمواتِ والأرضِ، رَبَّ كلِّ شيءٍ ومَليكَهُ، أشهدُ أن لا إلَهَ إلَّا أنتَ، أعوذُ بِكَ مِن شرِّ نفسي وشرِّ الشَّيطانِ وشِركِهِ، قلهُ إذا أصبَحتَ، وإذا أمسَيتَ، وإذا أخَذتَ مَضجعَكَ)."
                            ,"(اللَّهمَّ ما أصبحَ بي من نعمةٍ أو بأحدٍ من خلقِكَ فمنكَ وحدَكَ لا شريكَ لكَ فلكَ الحمدُ ولكَ الشُّكرُ فقد أدَّى شكرَ يومِهِ ومن قالَ مثلَ ذلكَ حينَ يمسي فقد أدَّى شكرَ ليلتِهِ)."
                            ,"(سُبْحَانَ اللهِ وَبِحَمْدِهِ، عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ)،  وهي تُقال ثلاث مرات."
                            ,"(اللَّهُمَّ إنِّي أصبَحتُ أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُكَ)."
                            ,"آية الكرسي: (اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ الْحَيُّ الْقَيُّومُ ۚ لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ ۚ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ مَن ذَا الَّذِي يَشْفَعُ عِندَهُ إِلَّا بِإِذْنِهِ ۚ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلَّا بِمَا شَاءَ ۚ وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ ۖ وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ)."
                            ,"أَصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله وَالحَمدُ لله ، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لهُ، لهُ المُـلكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير ، رَبِّ أسْـأَلُـكَ خَـيرَ ما في هـذا اليوم وَخَـيرَ ما بَعْـدَه ، وَأَعـوذُ بِكَ مِنْ شَـرِّ ما في هـذا اليوم وَشَرِّ ما بَعْـدَه، رَبِّ أَعـوذُ بِكَ مِنَ الْكَسَـلِ وَسـوءِ الْكِـبَر ، رَبِّ أَعـوذُ بِكَ مِنْ عَـذابٍ في النّـارِ وَعَـذابٍ في القَـبْر."
                            ,"(اللَّهمَّ عافِني في بدَني اللَّهمَّ عافِني في سمعي اللَّهمَّ عافِني في بصري لا إلهَ إلَّا أنت، اللَّهمَّ إنِّي أعوذُ بِكَ منَ الكُفْرِ والفقرِ اللَّهمَّ إنِّي أعوذُ بكَ من عذابِ القبرِ لا إلهَ إلَّا أنت). (ثَلاثَ مرَّاتٍ)"
                            ,"اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ على نَبِيِّنَا مُحمَّد، فقد جاء في الحديث: (مَن صلى عَلَيَّ حين يُصْبِحُ عَشْرًا ، وحين يُمْسِي عَشْرًا أَدْرَكَتْه شفاعتي يومَ القيامةِ)."
                            ,"قراءة سورة الإخلاص والمعوّذتين ثلاث مرات، قال رسول الله صلى الله عليه وسلم: (قُلْ هُوَ اللهُ أَحَدٌ، والْمُعَوِّذتَيْنِ حَينَ تُمسي وحين تُصبِحُ، ثلاثَ مراتٍ، يكفيكَ مِنْ كلِّ شئٍ):\n" +
                                    "\n" +
                                    "\"سورة الإخلاص\": (قُلْ هُوَ اللَّهُ أَحَدٌ* اللَّهُ الصَّمَدُ* لَمْ يَلِدْ وَلَمْ يُولَدْ* وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ).\n" +
                                    " \n" +
                                    "\" سورة الفلق\": (قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ* مِن شَرِّ مَا خَلَقَ* وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ* وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ* وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ).\n" +
                                    " \n" +
                                    "\" سورة الناس\": (قُلْ أَعُوذُ بِرَبِّ النَّاسِ* مَلك الناس* إله الناس* من شر الوسواس الخناس* الذي يوسوس في صدور الناس* من الجنة والناس).\n" ,
                                    ",(اللهم إني أسألك علما نافعا ورزقا طيبا وعملا متقبلا).")));


            azkarlist.add(new groupAzkar("أذكار المساء",Arrays.asList("(أَمْسَيْنَا وَأَمْسَى المُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ لا إلَهَ إلَّا اللَّهُ، وَحْدَهُ لا شَرِيكَ له، له المُلْكُ وَلَهُ الحَمْدُ وَهو علَى كُلِّ شيءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ ما في هذِه اللَّيْلَةِ وَخَيْرَ ما بَعْدَهَا، وَأَعُوذُ بكَ مِن شَرِّ ما في هذِه اللَّيْلَةِ وَشَرِّ ما بَعْدَهَا، رَبِّ أَعُوذُ بكَ مِنَ الكَسَلِ وَسُوءِ الكِبَرِ، رَبِّ أَعُوذُ بكَ مِن عَذَابٍ في النَّارِ وَعَذَابٍ في القَبْرِ)."
                    ,"(اللَّهُمَّ أنْتَ رَبِّي لا إلَهَ إلَّا أنْتَ، خَلَقْتَنِي وأنا عَبْدُكَ، وأنا علَى عَهْدِكَ ووَعْدِكَ ما اسْتَطَعْتُ، أعُوذُ بكَ مِن شَرِّ ما صَنَعْتُ، أبُوءُ لكَ بنِعْمَتِكَ عَلَيَّ، وأَبُوءُ لكَ بذَنْبِي فاغْفِرْ لِي، فإنَّه لا يَغْفِرُ الذُّنُوبَ إلَّا أنْتَ)."
                    ,"(بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ)، وتُقال ثلاث مرات."
                    ,"(اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ النُّشورُ)."
                    ,"(اللهمَّ إني أسألُك العفوَ والعافيةَ، في الدنيا والآخرةِ، اللهمَّ إني أسألُك العفوَ والعافيةَ، في دِيني ودنيايَ وأهلي ومالي، اللهمَّ استُرْ عوراتي، وآمِنْ روعاتي، واحفظني من بين يدي، ومن خلفي، وعن يميني، وعن شمالي، ومن فوقي، وأعوذُ بك أن أُغْتَالَ من تحتي)."
                    ,"(اللهمَّ إنِّي أعوذُ بك من الهمِّ والحزنِ، والعجزِ والكسلِ، والبُخلِ والجُبنِ، وضَلَعِ الدَّينِ، وغَلَبَةِ الرجالِ)."
                    ,"(اللَّهمَّ عالِمَ الغَيبِ والشَّهادةِ، فاطرَ السَّمواتِ والأرضِ، رَبَّ كلِّ شيءٍ ومَليكَهُ، أشهدُ أن لا إلَهَ إلَّا أنتَ، أعوذُ بِكَ مِن شرِّ نفسي وشرِّ الشَّيطانِ وشِركِهِ) قلهُ إذا أصبَحتَ، وإذا أمسَيتَ، وإذا أخَذتَ مَضجعَكَ."
                    ,"(يا حيُّ يا قيُّومُ، برَحمتِكَ أستَغيثُ، أصلِح لي شأني كُلَّهُ، ولا تَكِلني إلى نَفسي طرفةَ عينٍ)."
                    ,"(سبحانَ اللَّهِ وبحمدِهِ مئةَ مرَّةٍ: لم يأتِ أحدٌ يومَ القيامةِ بأفضلَ ممَّا جاءَ بِهِ، إلَّا أحدٌ قالَ مثلَ ما قالَ، أو زادَ علَيهِ)."
                    ,"(سُبْحَانَ اللهِ وَبِحَمْدِهِ، عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ)،  وهي تُقال ثلاث مرات."
                    ,"(اللَّهُمَّ إنِّي أصبَحتُ أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُكَ)."
                    ,"قراءة سورة الإخلاص والمعوّذتين ثلاث مرات، قال رسول الله صلى الله عليه وسلم: (قُلْ هُوَ اللهُ أَحَدٌ، والْمُعَوِّذتَيْنِ حَينَ تُمسي وحين تُصبِحُ، ثلاثَ مراتٍ، يكفيكَ مِنْ كلِّ شئٍ):\n" +
                            "\n" +
                            "\"سورة الإخلاص\": (قُلْ هُوَ اللَّهُ أَحَدٌ* اللَّهُ الصَّمَدُ* لَمْ يَلِدْ وَلَمْ يُولَدْ* وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ).\n" +
                            " \n" +
                            "\" سورة الفلق\": (قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ* مِن شَرِّ مَا خَلَقَ* وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ* وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ* وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ).\n" +
                            " \n" +
                            "\" سورة الناس\": (قُلْ أَعُوذُ بِرَبِّ النَّاسِ* مَلك الناس* إله الناس* من شر الوسواس الخناس* الذي يوسوس في صدور الناس* من الجنة والناس).\n"
                    ,"(اللَّهمَّ إنِّي أسألُكَ عِلمًا نافعًا ورزقًا طيِّبًا وعملًا متقبَّلًا)."
                    ,"آية الكرسي: (اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ الْحَيُّ الْقَيُّومُ ۚ لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ ۚ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ مَن ذَا الَّذِي يَشْفَعُ عِندَهُ إِلَّا بِإِذْنِهِ ۚ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلَّا بِمَا شَاءَ ۚ وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ ۖ وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ)."
                    ,"(اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ على نَبِيِّنَا مُحمَّد، فقد جاء في الحديث: مَن صلى عَلَيَّ حين يُصْبِحُ عَشْرًا، وحين يُمْسِي عَشْرًا، أَدْرَكَتْه شفاعتي يومَ القيامةِ)."
                    ,"(من قال: أستغفرُ اللهَ العظيمَ الذي لا إلهَ إلَّا هو الحيَّ القيومَ وأتوبُ إليه؛ غُفِرَ له وإنْ كان فرَّ من الزحفِ)."
                    ,"(لا إلهَ إلَّا اللهُ وحدَه لا شريكَ له له الملكُ وله الحمدُ وهو على كلِّ شيءٍ قديرٌ)."
                    ,"(اللَّهمَّ عافِني في بدَني اللَّهمَّ عافِني في سمعي اللَّهمَّ عافِني في بصري لا إلهَ إلَّا أنت، اللَّهمَّ إنِّي أعوذُ بِكَ منَ الكُفْرِ والفقرِ اللَّهمَّ إنِّي أعوذُ بكَ من عذابِ القبرِ لا إلهَ إلَّا أنت) وتقال ثَلاثَ مرَّاتٍ."
                    ,"(أمسَيْنا على فِطرةِ الإسلامِ وعلى كَلِمةِ الإخلاصِ وعلى دينِ نبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّم وعلى مِلَّةِ أبينا إبراهيمَ حنيفًا مسلمًا وما كان مِنَ المشركينَ).")));

            azkarlist.add(new groupAzkar("أذكار الصلاة",Arrays.asList("[أدعية استفتاح الصلاة]\n" +
                    "اللَّهُمَّ بَاعِدْ بَيْنِيْ وَبَيْنَ خَطَايَايَ كَمَا بَاعَدْتَ بَيْنَ الْمَشْرِقِ وَالْمَغْرِبِ، اللهم نَقِّنِيْ مِنْ خَطَايَايَ كَمَا يُنَقَّى الثَّوْبُ الْأبْيَضُ مِنَ الدَّنَسِ، اللهم اغْسِلْنِيْ مِنْ خَطَايَايَ، بِالثَّلْجِ وَالْمَاءِ والْبَرَدِ.\n" +
                    "سُبْحَانَكَ سُبْحَانَكَ اللهم وَبِحَمْدِكَ، وَتَبَارَكَ اسْمُكَ، وَتَعَالَى جَدُّكَ، وَلَا إِلَهَ غَيْرُكَ.\n" +
                    "الْحَمْدُ الْحَمْدُ للّهِ حَمْداً كَثِيراً طَيِّباً مُبَارَكاً فِيهِ.\n" +
                    "اللهُ أكْبَرُ كَبِيْرًا، وَالْحَمْدُ لِلهِ كَثِيْرًا، وَسُبْحَانَ اللهِ بُكْرَةً وَّاصِيْلًا. أعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ: مِنْ نَفْخِهِ، وَنَفْثِهِ، وَهَمْزِهِ.\n" +
                    "اللَّهُمَّ رَبَّ جَبْرَائِيلَ، وَمِيْكَائِيلَ، وَإِسْرَافِيْلَ، فَاطِرَ السَّمَوَاتِ وَالْأرْضِ، عَالِمَ الغَيْبِ وَالشَّهَادَةِ أنْتَ تَحْكُمُ بَيْنَ عِبَادِكَ فِيْمَا كَانُوا فِيْهِ يَخْتَلِفُونَ، اِهْدِنِيْ لِمَا اخْتُلِفَ فِيْهِ مِنَ الْحَقِّ بِإِذْنِكَ إِنَّكَ تَهْدِيْ مَنْ تَشَاءُ إِلَى صِرَاطٍ مُّسْتَقِيْمٍ.\n" +
                    "وَجَّهْتُ وَجْهِيَ لِلَّذِيْ فَطَرَ السَّمَوَاتِ وَالْأرْضَ حَنِيْفًا وَّمَا أنَا مِنَ الْمُشْرِكِيْنَ، إِنَّ صَلَاتِيْ، وَنُسُكِيْ، وَمَحْيَايَ، وَمَمَاتِيْ لِلهِ رَبِّ الْعَالَمِيْنَ، لَا شَرِيْكَ لَهُ وَبِذَلِكَ أُمِرْتُ وَانَا مِنَ الْمُسْلِمِيْنَ، اللهم أنْتَ الْمَلِكُ لَا إِلَهَ إِلَّا أنْتَ، أنْتَ رَبِّيْ وَأنَا عَبْدُكَ، ظَلَمْتُ نَفْسِيْ وَاعْتَرَفْتُ بِذَنْبِيْ فَاغْفِرْ لِيْ ذُنُوْبِيْ جَمِيْعًا إِنَّهُ لَا يَغْفِرُ الذُّنوبَ إِلَّا أنْتَ. وَاهْدِنِيْ لِأحْسَنِ الْأخْلَاقِ لَا يَهْدِيْ لِأحْسَنِهَا إِلَّا أنْتَ، وَاصْرِفْ عَنِّيْ سَيِّئَهَا، لَا يَصْرِفُ عَنِّيْ سَيِّئَهَا إِلَّا أنْتَ، لَبَّيْكَ وَسَعْدَيْكَ، وَالْخَيْرُ كُلُّهُ بِيَدَيْكَ، وَالشَّرُّ لَيْسَ إِلَيْكَ، أنَا بِكَ وَإِلَيْكَ، تَبارَكْتَ وَتَعَالَيْتَ، أسْتَغْفِرُكَ وَأتُوْبُ إِلَيْكَ."
                    ,"[أدعية الركوع]\n" +
                            "سُبْحانَ رَبِّيَ الْعَظِيْمِ. ثلاث مراتٍ أو أكثر.\n" +
                            "سُبْحَانَ رَبِّيَ العَظِيمِ وَبِحَمْدِهِ. ثلاث مراتٍ.\n" +
                            "سُبحانَكَ اللّهمَّ ربَّنا وَبِحمدِكَ، اللّهمَّ اغفِرْ لي.\n" +
                            "سُبُّوُحٌ، قُدُّوسٌ، رَبُّ المَلَائِكَةِ وَالرُّوْحِ.\n" +
                            "سُبْحَانَ ذِيْ الْجَبَرُوْتِ، وَالْمَلَكُوْتِ، وَالْكِبْرِيَاءِ، وَالْعَظَمَةِ.\n" +
                            "اللَّهُمَّ لَكَ رَكَعْتُ، وَبِكَ آمَنْتُ، وَلَكَ أَسْلَمْتُ، خَشَعَ لَكَ سَمْعِي وَبَصَرِي، وَمُخِّي وَعَظْمِي وَعَصَبِي."
                    ,"[أدعية الرفع من الركوع]\n" +
                            "سَمِعَ اللهُ لِمَنْ حَمِدَهُ.\n" +
                            "رَبَّنَا وَلَكَ الْحَمْدُ، حَمْدًا كَثِيْرًا طَيِّبًا مُبارَكًا فِيْهِ.\n" +
                            "اللَّهُمَّ لَكَ رَكَعْتُ، وَبِكَ آمَنْتُ، وَلَكَ اسْلَمْتُ، خَشَعَ لَكَ سَمْعِيْ، و بَصَـرِيْ، وَمُخِّيْ، وَعَظْمِيْ، وَعَصَبِيْ، وَمَا استَقَلَّتْ بِهِ قَدَمِيْ لِلهِ رَبِّ الْعَالَمِيْنَ.\n" +
                            "اللَّهُمَّ رَبَّنَا لَكَ الْحَمْدُ مِلْءَ السَّمَاوَاتِ وَمِلْءَ الْارْضِ، وَمَا بَيْنَهُمَا، وَمِلْءَ مَا شِئْتَ مِنْ شَيْءٍ بَعْدُ، أهْلَ الثَّنَاءِ وَالْمَجْدِ، أحَقُّ مَا قَالَ الْعَبْدُ، وَكُلُّنَا لَكَ عَبْدٌ، اللهم لَا مَانِعَ لِمَا أعْطَيْتَ، وَلَا مُعْطِيَ لِمَا مَنَعْتَ، وَلَا يَنْفَعُ ذَا الجَدِّ مِنْكَ الْجَدُّ.\n" +
                            "اللَّهُمَّ لَكَ الْحَمْدُ مِلْءَ السَّمَاءِ، وَمِلْءَ الْارْضِ، وَمِلْءَ مَا شِئْتَ مِنْ شَيْءٍ بَعْدُ، اللَّهُمَّ طَهِّرْنِي بِالثَّلْجِ وَالْبَرَدِ، وَالْمَاءِ الْبَارِدِ، اللَّهُمَّ طَهِّرْنِي مِنَ الذُّنُوبِ وَالْخَطَايَا، كَمَا يُنَقَّى الثَّوْبُ الْابْيَضُ مِنَ الْوَسَخِ."
                    ,"[أدعية السجود]\n" +
                            "سُبْحَانَ رَبِّيَ الأَعْلَى. ثلاث مرات أو أكثر.\n" +
                            "سُبْحَانَ رَبِّيَ الأعْلَى وَبِحَمْدِهِ. ثلاث مرات.\n" +
                            "سُبُّوحٌ قُدُّوسٌ رَبُّ الْمَلاَئِكَةِ وَالرُّوحِ.\n" +
                            "سُبحانَكَ اللّهمَّ ربَّنا وَبِحمدِكَ، اللّهمَّ اغفِرْ لي.\n" +
                            "سُبْحَانَ ذِي الْجَبْرُوتِ وَالْمَلَكُوتِ وَالْكِبْرِيَاءِ وَالْعَظَمَةِ.\n" +
                            "اللَّهُمَّ اغْفِرْ لِي ذَنْبِي كُلَّهُ دِقَّهُ وَجِلَّهُ، وَأَوَّلَهُ وَآخِرَهُ، وَعَلاَنِيَتَهُ وَسِرَّهُ.\n" +
                            "اللَّهُمَّ لَكَ سَجَدْتُّ وَبِكَ آمَنْتُ، وَلَكَ أسْلَمْتُ، سَجَدَ وَجْهِي لِلَّذِيْ خَلَقَهُ، وَصَوَّرَهُ، وَشَقَّ سَمْعَهُ وَبَصَرَهُ، تَبَارَكَ اللهُ أحْسَنُ الْخَالِقيْنَ.\n" +
                            "اللَّهُمَّ إِنِّيْ أعُوْذُ بِرِضَاكَ مِنْ سَخَطِكَ، وَبِمُعَافَاتِكَ مِنْ عُقوْبَتِكَ، وَأعُوْذُ بِكَ مِنْكَ، لَا أُحْصِـي ثَنَاءً عَلَيْكَ، أنْتَ كَمَا أثْنَيْتَ عَلَى نَفْسِكَ.\n" +
                            "رَبِّ اعْطِ نَفْسِي تَقْوَاهَا زَكِّهَا أنْتَ خَيْرُ مَنْ زَكَّاهَا أنْتَ وَلِيُّهَا وَمَوْلَاهَا.\n" +
                            "اللَّهُمَّ اجْعَلْ فِي قَلْبِي نُورًا وَاجْعَلْ فِيْ سَمْعِيْ نُورًا وَاجْعَلْ فِيْ بَصَرِيْ نُورًا وَاجْعَلْ مِنْ تَحْتِي نُورًا وَاجْعَلْ مِنْ فَوْقِي نُورًا وَعَنْ يَمِينِي نُورًا وَعَنْ يَسَارِي نُورًا وَاجْعَلْ أمَامِي نُورًا وَاجْعَلْ خَلْفِي نُورًا وَأعْظِمْ لِيْ نُورًا.\n"
                    ,"[أدعية الجلوس بين السجدتين]\n" +
                            "رَبِّ رَبِّ اغْفِرْ لِيْ، رَبِّ اغْفِرْ لِيْ.\n" +
                            "اللَّهُمَّ اغْفِرْ لِيْ، وَارْحَمْنِيْ، وَاهْدِنِيْ، وَاجْبُرْنِيْ، وَعَافِنِيْ، وَارْزُقْنِيْ، وَارْفَعْنِيْ."
            ,"[دعاء سجود التلاوة]\n" +
                            "سَجَدَ وَجْهِيَ للَّذِي خَلَقَهُ، وَشَقَّ سَمْعَهُ وبَصَرَهُ، بِحَوْلِهِ وَقُوَّتِهِ، فَتَبَارَكَ اللَّهُ أَحْسَنُ الْـخَالِقِينَ.\n" +
                            "اللَّهُمَّ اكْتُبْ لِي بِهَا عِنْدَكَ أجْراً، وَضَعْ عَنِّي بِهَا وِزْرَاً، واْجعَلْهَا لِي عِنْدِكَ ذُخْراً، وتَقَبَّلَهَا مِنِّي كَمَا تَقَبَّلْتَهَا مِنْ عَبْدِكَ دَاوُدَ."
            ,"[التشهد الأول]\n" +
                            "التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ السَّلَامُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلَامُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ ، أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ.\n" +
                            "\n"
            ,"[التشهد الأخير]\n" +
                            "التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ السَّلَامُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ السَّلَامُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ ، أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ. اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ ، اللَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ.\n" +
                            "\n"
            ,"[أدعية بعد التشهد الأخير وقبل السلام]\n" +
                            "اللَّهُمَّ إِنِّيْ أعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، وَمِنْ عَذَابِ جَهَنَّمَ، وَمِنْ فِتْنَةِ الْمَحْيَا وَالْمَمَاتِ، وَمِنْ شَرِّ فِتْنَةِ الْمَسِيْحِ الدَّجَّالِ.")));

            azkarlist.add(new groupAzkar("أذكار النوم",Arrays.asList("اسْمِكَ رَبِّـي وَضَعْـتُ جَنْـبي ، وَبِكَ أَرْفَعُـه، فَإِن أَمْسَـكْتَ نَفْسـي فارْحَـمْها ، وَإِنْ أَرْسَلْتَـها فاحْفَظْـها بِمـا تَحْفَـظُ بِه عِبـادَكَ الصّـالِحـين. "
            ,"اللّهُـمَّ إِنَّـكَ خَلَـقْتَ نَفْسـي وَأَنْـتَ تَوَفّـاهـا لَكَ ممَـاتـها وَمَحْـياها ، إِنْ أَحْيَيْـتَها فاحْفَظْـها ، وَإِنْ أَمَتَّـها فَاغْفِـرْ لَـها . اللّهُـمَّ إِنَّـي أَسْـأَلُـكَ العـافِـيَة. "
            ,"اللّهُـمَّ قِنـي عَذابَـكَ يَـوْمَ تَبْـعَثُ عِبـادَك."
            ,"بِاسْـمِكَ اللّهُـمَّ أَمـوتُ وَأَحْـيا. "
            ,"الـحَمْدُ للهِ الَّذي أَطْـعَمَنا وَسَقـانا، وَكَفـانا، وَآوانا، فَكَـمْ مِمَّـنْ لا كـافِيَ لَـهُ وَلا مُـؤْوي."
            ,"اللّهُـمَّ عالِـمَ الغَـيبِ وَالشّـهادةِ فاطِـرَ السّماواتِ وَالأرْضِ رَبَّ كُـلِّ شَـيءٍ وَمَليـكَه، أَشْهـدُ أَنْ لا إِلـهَ إِلاّ أَنْت، أَعـوذُ بِكَ مِن شَـرِّ نَفْسـي، وَمِن شَـرِّ الشَّيْـطانِ وَشِـرْكِه، وَأَنْ أَقْتَـرِفَ عَلـى نَفْسـي سوءاً أَوْ أَجُـرَّهُ إِلـى مُسْـلِم ."
            ,"اللّهُـمَّ أَسْـلَمْتُ نَفْـسي إِلَـيْكَ، وَفَوَّضْـتُ أَمْـري إِلَـيْكَ، وَوَجَّـهْتُ وَجْـهي إِلَـيْكَ، وَأَلْـجَـاْتُ ظَهـري إِلَـيْكَ، رَغْبَـةً وَرَهْـبَةً إِلَـيْكَ، لا مَلْجَـأَ وَلا مَنْـجـا مِنْـكَ إِلاّ إِلَـيْكَ، آمَنْـتُ بِكِتـابِكَ الّـذي أَنْزَلْـتَ وَبِنَبِـيِّـكَ الّـذي أَرْسَلْـت. "
            ,"[سورة البقرة]: أَعُوذُ بِاللهِ مِنْ الشَّيْطَانِ الرَّجِيمِ\n" +
                            "آمَنَ الرَّسُولُ بِمَا أُنْزِلَ إِلَيْهِ مِنْ رَبِّهِ وَالْمُؤْمِنُونَ ۚ كُلٌّ آمَنَ بِاللَّهِ وَمَلَائِكَتِهِ وَكُتُبِهِ وَرُسُلِهِ لَا نُفَرِّقُ بَيْنَ أَحَدٍ مِنْ رُسُلِهِ ۚ وَقَالُوا سَمِعْنَا وَأَطَعْنَا ۖ غُفْرَانَكَ رَبَّنَا وَإِلَيْكَ الْمَصِيرُ. لَا يُكَلِّفُ اللَّهُ نَفْسًا إِلَّا وُسْعَهَا لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ رَبَّنَا لَا تُؤَاخِذْنَا إِنْ نَسِينَا أَوْ أَخْطَأْنَا رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِينَ مِنْ قَبْلِنَا رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِهِ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَا أَنْتَ مَوْلَانَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ. [البقرة 285 - 286]"
            ,"[آية الكرسى]: أَعُوذُ بِاللهِ مِنْ الشَّيْطَانِ الرَّجِيمِ\n" +
                            "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ. [البقرة 255]"
            ,"[أذكار من قلق في فراشه ولم ينم]\n" +
                            "عن بريدة رضي الله عنه، قال\u200F:\u200F شكا خالد بن الوليد رضي الله عنه إلى النبي صلى الله عليه وسلم فقال\u200F:\u200F يا رسول الله\u200F!\u200F ما أنام الليل من الأرق، فقال النبي صلى الله عليه وسلم\u200F:\u200F \u200F\"\u200Fإذا أويت إلى فراشك فقل\u200F:\u200F اللهم رب السموات السبع وما أظلت، ورب الأرضين وما أقلت، ورب الشياطين وما أضلت، كن لي جارا من خلقك كلهم جميعا أن يفرط علي أحد منهم أو أن يبغي علي، عز جارك، وجل ثناؤك ولا إله غيرك، ولا إله إلا أنت\u200F\"\n" +
                            "\n" +
                            "عن عمرو بن شعيب، عن أبيه، عن جده: أن رسول الله صلى الله عليه وسلم كان يعلمهم من الفزع كلمات\u200F:\u200F \u200F\"\u200Fأعوذ بكلمات الله التامة من غضبه وشر عباده، ومن همزات الشياطين وأن يحضرون\u200F\" "
            ,"[أذكار الأحلام]\n" +
                            "عن أبي قتادة رضي الله عنه قال\u200F:\u200F قال رسول الله صلى الله عليه وسلم\u200F:\u200F \u200F\"\u200Fالرؤيا الصالحة\u200F\"\u200F وفي رواية \u200F\"\u200Fالرؤيا الحسنة من الله، والحلم من الشيطان، فمن رأى شيئا يكرهه فلينفث عن شماله ثلاثا وليتعوذ من الشيطان، فإنها لا تضره\u200F\". ")));
            azkarlist.add(new groupAzkar("دعاء الركوب",Arrays.asList("بِسْمِ اللَّهِ، وَالْحَمْدُ للَّهِ ﴿ سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ * وَإِنَّا إِلَى رَبِّنَا لَمُنْقَلِبُونَ ﴾ ، ((الْحَمْدُ لِلَّهِ، الْحَمْدُ لِلَّهِ، الْحَمْدُ لِلَّهِ، اللَّهُ أَكْبَرُ، اللَّهُ أَكْبَرُ، اللَّهُ أَكْبَرُ، سُبْحَانَكَ اللَّهُمَّ إِنِّي ظَلَمْتُ نَفْسِي فَاغْفِرْ لِي؛ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوبَ إِلاَّ أَنْتَ.")));

            azkarlist.add(new groupAzkar("دعاء الإستخاره",Arrays.asList("قال رسول الله صلّى الله عليه وسلّم:\n" +
                    " (إذَا هَمَّ أحَدُكُمْ بالأمْرِ فَلْيَرْكَعْ رَكْعَتَيْنِ مِن غيرِ الفَرِيضَةِ، ثُمَّ لِيَقُلْ):\n" +
                    "\n" +
                    " ﴿اللَّهُمَّ إنِّي أسْتَخِيرُكَ بعِلْمِكَ وأَسْتَقْدِرُكَ بقُدْرَتِكَ، وأَسْأَلُكَ مِن فَضْلِكَ فإنَّكَ تَقْدِرُ ولَا أقْدِرُ، وتَعْلَمُ ولَا أعْلَمُ، وأَنْتَ عَلَّامُ الغُيُوبِ، اللَّهُمَّ فإنْ كُنْتَ تَعْلَمُ هذا الأمْرَ - ثُمَّ تُسَمِّيهِ بعَيْنِهِ - خَيْرًا لي في عَاجِلِ أمْرِي وآجِلِهِ - قالَ: أوْ في دِينِي ومعاشِي وعَاقِبَةِ أمْرِي - فَاقْدُرْهُ لي ويَسِّرْهُ لِي، ثُمَّ بَارِكْ لي فِيهِ، اللَّهُمَّ وإنْ كُنْتَ تَعْلَمُ أنَّه شَرٌّ لي في دِينِي ومعاشِي وعَاقِبَةِ أمْرِي - أوْ قالَ: في عَاجِلِ أمْرِي وآجِلِهِ - فَاصْرِفْنِي عنْه، واقْدُرْ لي الخَيْرَ حَيْثُ كانَ ثُمَّ رَضِّنِي بهِ﴾ .")));
        return  azkarlist;
    }
}
