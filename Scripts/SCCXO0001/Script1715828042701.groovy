import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.139.47/ui-onboarding/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Pilih produk lain_chakra-checkbox__con_f17e9e'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Belum Memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    'Investasi', true)

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_ADART'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Amrudin Effendi Putra')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '967899876789')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia.astrida@indocyber.id')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih Bentuk Badan UsahaPTBankKopera_6d3d37'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nama Perusahaan_onboardDto.compName'), 'SINAR CAHAYA GEMILANG')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih BidangSektor UsahaAIRBEARER CO_896bdf'), 
    '3100', true)

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tempat Usaha Berdiri_onboardDto.businessEst'), 
    'JAKARTA')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Usaha Berdiri_onboardDto.busi_5a7ca8'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Usaha Berdiri_onboardDto.busi_5a7ca8'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_17'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Jumlah Karyawan_onboardDto.employeeCount'), 
    '98')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Tidak'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Tidak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Penghasilan Pertahun_onboardDto.annualIncome'), 
    '999999999')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Jumlah Pelanggan_onboardDto.customerCount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Persentase Pelanggan Domestik_onboard_21796c'), 
    '85')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih NegaraIndonesia'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih ProvinsiKalimantan SelatanKali_d34dfd'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih KotaPilih KotaKepulauan SeribuJak_f86bb5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '357', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih KecamatanGrogol PetamburanKali_96bd38'), 
    '5784', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih KelurahanJatipuloKemanggisanKo_4906ba'), 
    '92279', true)

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Kode Pos_onboardDto.postalCode'), '11478')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_J'), 'J')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl'), 'Jl')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl_1'), 'Jl.')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl_1_2'), 'Jl. ')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. K'), 'Jl. K')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Ke'), 'Jl. Ke')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kem'), 'Jl. Kem')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kema'), 'Jl. Kema')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Keman'), 'Jl. Keman')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemang'), 'Jl. Kemang')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemangg'), 'Jl. Kemangg')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggi'), 'Jl. Kemanggi')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggis'), 'Jl. Kemanggis')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisa'), 'Jl. Kemanggisa')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan'), 'Jl. Kemanggisan')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan_1'), 'Jl. Kemanggisan ')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan I'), 'Jl. Kemanggisan I')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Il'), 'Jl. Kemanggisan Il')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ili'), 'Jl. Kemanggisan Ili')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir'), 'Jl. Kemanggisan Ilir')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir_1'), 'Jl. Kemanggisan Ilir ')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir N'), 'Jl. Kemanggisan Ilir N')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No'), 'Jl. Kemanggisan Ilir No')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No_1'), 'Jl. Kemanggisan Ilir No ')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No 6'), 'Jl. Kemanggisan Ilir No 6')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No_1'), 'Jl. Kemanggisan Ilir No ')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No 7'), 'Jl. Kemanggisan Ilir No 7')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir No 77'), 'Jl. Kemanggisan Ilir No 77')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir INo 77'), 'Jl. Kemanggisan Ilir INo 77')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_Jl. Kemanggisan Ilir I No 77'), 'Jl. Kemanggisan Ilir I No 77')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '5487575799')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/label_Alamat Email Perusahaan'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '0812345678765')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'www.sinarcahayagemilang.com')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_NPWP'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_NPWP_onboardPermitsDto.npwp'), '1234567890123456')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), 
    '3456789098765456789')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_1'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'), 
    '4567890987654567890')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_6'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nama Notaris_onboardPermitsDto.notaryName'), 
    'Idris')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tempat Akte Dibuat_onboardPermitsDto._2e8135'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Akte Perubahan_onboardPermitsDt_3d2154'), 
    '1234567890987')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_7fe17e'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_7fe17e'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_6'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Notaris_onboardPermitsDto.notary'), 'Indira')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '1234567890123678')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '1234567890123')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_6'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_May 2024'))

WebUI.doubleClick(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Sa'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Sa'))

WebUI.doubleClick(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Notaris_onboardPermitsDto.notary'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Notaris_onboardPermitsDto.notary'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_29'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/img'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Klik untuk upload'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/label_Klik untuk upload atau drag and dropF_848054'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_atau drag and drop'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/img'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_c29bdb'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Inquiry'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Tidak'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_User ID_usersDto.makerDto.0.userId'), 'IDA9011')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nama User_usersDto.makerDto.0.userName'), 'Ida Wasida')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Nomor Handphone'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Handphone_usersDto.makerDto.0.p_729376'), 
    '0823456789')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email_usersDto.makerDto.0.email'), '')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email_usersDto.makerDto.0.email'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Handphone_usersDto.makerDto.0.p_729376'), 
    '08234567896789')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email_usersDto.makerDto.0.email'), 'ida.wasida@gmail.com')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih Cabang PendaftaranPilih Cabang Tu_36b698'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_BUOL TOLI-TOLI - JL. SYARIF MANSYUR (JL_d4d948'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_SETRASARI - JL. PROF. DRG. SURYA SUMANT_c96682'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Pilih Jadwal Kunjungan_onboardDto.visitDate'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_23'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih Cabang PendaftaranPilih Cabang Tu_face90'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Profil Orang Yang Berwenang'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Selanjutnya_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Email Personal_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Edit_chakra-button css-1b6elut'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Edit_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/path'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2_3'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Edit_chakra-icon css-onkibi_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'IDA_WASIDA_2010')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Inquiry'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Tidak'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan e-Form'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan Umum Cash Management'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan Umum Cash Management'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan e-Form'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'IDAW_301')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_User User IDNama UserNomor HandphoneAla_744532'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'abcd123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_User Operational RegistrationBuat Busin_66f84a'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'abce123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan Umum Cash Management'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih cabang tujuan_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/path_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/path_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Pilih cabang tujuan_css-8mmkcg'))

WebUI.doubleClick(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_Pilih cabang tujuan_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_JELAMBAR BARU - JL. JELAMBAR BARU RAYA _00a004'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih cabang tujuan_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Pilih Cabang PendaftaranPilih Cabang Tu_face90'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'abce123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_User Operational RegistrationBuat Busin_66f84a'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'abce123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '082345678900')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'www.sinarcahayagemilang.com')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '08345678909876')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'www.sinarcahayagemilang.com')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '085678909876')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/textarea_www.sinarcahayagemilang.com'), 'www.sinarcahayagemilang.com')

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'www.sinarcahayagemilang.com')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Inquiry'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Tidak'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/svg_User Approval must not Different with u_3f1839'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/path_1_2'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'IDAW123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_User Operational RegistrationBuat Busin_66f84a'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Kembali'))

WebUI.setText(findTestObject('Object Repository/TC0011/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'IDAw123')

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/div_Syarat dan Ketentuan e-Form'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/TC0011/Page_Onboarding/button_Selesai  Kirim'))

